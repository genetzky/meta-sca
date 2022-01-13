SUMMARY = "go.mod: cloud.google.com/go/pubsub"
HOMEPAGE = "https://pkg.go.dev/cloud.google.com/go/pubsub"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require cloud.google.com-go-pubsub-sources.inc
EXTRA_DEPENDS += "\
    nativesdk-cloud.google.com-go \
    nativesdk-github.com-golang-protobuf \
    nativesdk-github.com-google-go-cmp \
    nativesdk-github.com-googleapis-gax-go-v2 \
    nativesdk-go.opencensus.io \
    nativesdk-golang.org-x-sync \
    nativesdk-golang.org-x-time \
    nativesdk-google.golang.org-api \
    nativesdk-google.golang.org-genproto \
    nativesdk-google.golang.org-grpc \
    nativesdk-google.golang.org-protobuf \
"
GO_IMPORT = "cloud.google.com/go/pubsub"
inherit gosrc
inherit nativesdk
