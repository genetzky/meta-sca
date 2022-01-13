SUMMARY = "go.mod: github.com/grpc-ecosystem/go-grpc-middleware"
HOMEPAGE = "https://pkg.go.dev/github.com/grpc-ecosystem/go-grpc-middleware"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-grpc-ecosystem-go-grpc-middleware-sources.inc
EXTRA_DEPENDS += "\
    nativesdk-github.com-go-kit-kit \
    nativesdk-github.com-gogo-protobuf \
    nativesdk-github.com-golang-protobuf \
    nativesdk-github.com-opentracing-opentracing-go \
    nativesdk-github.com-sirupsen-logrus \
    nativesdk-github.com-stretchr-testify \
    nativesdk-go.uber.org-zap \
    nativesdk-golang.org-x-net \
    nativesdk-google.golang.org-grpc \
"
GO_IMPORT = "github.com/grpc-ecosystem/go-grpc-middleware"
inherit gosrc
inherit nativesdk
