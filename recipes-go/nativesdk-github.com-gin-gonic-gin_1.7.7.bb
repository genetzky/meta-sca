SUMMARY = "go.mod: github.com/gin-gonic/gin"
HOMEPAGE = "https://pkg.go.dev/github.com/gin-gonic/gin"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-gin-gonic-gin-sources.inc
EXTRA_DEPENDS += "\
    nativesdk-github.com-gin-contrib-sse \
    nativesdk-github.com-go-playground-validator-v10 \
    nativesdk-github.com-golang-protobuf \
    nativesdk-github.com-json-iterator-go \
    nativesdk-github.com-mattn-go-isatty \
    nativesdk-github.com-stretchr-testify \
    nativesdk-github.com-ugorji-go-codec \
    nativesdk-gopkg.in-yaml.v2 \
"
GO_IMPORT = "github.com/gin-gonic/gin"
inherit gosrc
inherit nativesdk
