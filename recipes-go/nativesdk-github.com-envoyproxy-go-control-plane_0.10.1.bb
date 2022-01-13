SUMMARY = "go.mod: github.com/envoyproxy/go-control-plane"
HOMEPAGE = "https://pkg.go.dev/github.com/envoyproxy/go-control-plane"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-envoyproxy-go-control-plane-sources.inc
EXTRA_DEPENDS += "\
    nativesdk-github.com-census-instrumentation-opencensus-proto \
    nativesdk-github.com-cncf-xds-go \
    nativesdk-github.com-envoyproxy-protoc-gen-validate \
    nativesdk-github.com-golang-protobuf \
    nativesdk-github.com-prometheus-client-model \
    nativesdk-go.opentelemetry.io-proto-otlp \
    nativesdk-google.golang.org-genproto \
    nativesdk-google.golang.org-grpc \
    nativesdk-google.golang.org-protobuf \
"
GO_IMPORT = "github.com/envoyproxy/go-control-plane"
inherit gosrc
inherit nativesdk
