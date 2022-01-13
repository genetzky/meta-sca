SUMMARY = "go.mod: go.opentelemetry.io/proto/otlp"
HOMEPAGE = "https://pkg.go.dev/go.opentelemetry.io/proto/otlp"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require go.opentelemetry.io-proto-otlp-sources.inc
EXTRA_DEPENDS += "\
    nativesdk-github.com-golang-protobuf \
    nativesdk-github.com-grpc-ecosystem-grpc-gateway \
    nativesdk-google.golang.org-grpc \
    nativesdk-google.golang.org-protobuf \
"
GO_IMPORT = "go.opentelemetry.io/proto/otlp"
inherit gosrc
inherit nativesdk
