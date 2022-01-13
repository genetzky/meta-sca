SUMMARY = "go.mod: contrib.go.opencensus.io/exporter/stackdriver"
HOMEPAGE = "https://pkg.go.dev/contrib.go.opencensus.io/exporter/stackdriver"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require contrib.go.opencensus.io-exporter-stackdriver-sources.inc
EXTRA_DEPENDS += "\
    nativesdk-cloud.google.com-go \
    nativesdk-cloud.google.com-go-monitoring \
    nativesdk-cloud.google.com-go-trace \
    nativesdk-github.com-aws-aws-sdk-go \
    nativesdk-github.com-census-instrumentation-opencensus-proto \
    nativesdk-github.com-golang-protobuf \
    nativesdk-github.com-google-go-cmp \
    nativesdk-github.com-jstemmer-go-junit-report \
    nativesdk-go.opencensus.io \
    nativesdk-golang.org-x-lint \
    nativesdk-golang.org-x-oauth2 \
    nativesdk-golang.org-x-tools \
    nativesdk-google.golang.org-api \
    nativesdk-google.golang.org-genproto \
    nativesdk-google.golang.org-grpc \
    nativesdk-google.golang.org-protobuf \
    nativesdk-honnef.co-go-tools \
"
GO_IMPORT = "contrib.go.opencensus.io/exporter/stackdriver"
# version is too far behind on cloud APIs - disable the compile
do_compile[noexec] = "1"
inherit gosrc
inherit nativesdk
