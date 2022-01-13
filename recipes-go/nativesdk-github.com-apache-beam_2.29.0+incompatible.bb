SUMMARY = "go.mod: github.com/apache/beam"
HOMEPAGE = "https://pkg.go.dev/github.com/apache/beam"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-apache-beam-sources.inc
EXTRA_DEPENDS += "\
    nativesdk-cloud.google.com-go-bigquery \
    nativesdk-cloud.google.com-go-datastore \
    nativesdk-cloud.google.com-go-pubsub \
    nativesdk-cloud.google.com-go-storage \
    nativesdk-github.com-golang-protobuf \
    nativesdk-github.com-google-go-cmp \
    nativesdk-github.com-linkedin-goavro \
    nativesdk-github.com-nightlyone-lockfile \
    nativesdk-github.com-spf13-cobra \
    nativesdk-golang.org-x-net \
    nativesdk-golang.org-x-oauth2 \
    nativesdk-golang.org-x-text \
    nativesdk-google.golang.org-api \
    nativesdk-google.golang.org-genproto \
    nativesdk-google.golang.org-grpc \
    nativesdk-google.golang.org-protobuf \
    nativesdk-gopkg.in-yaml.v2 \
"
GO_IMPORT = "github.com/apache/beam"
# needs CGO
do_compile[noexec] = "1"
inherit gosrc
inherit nativesdk
