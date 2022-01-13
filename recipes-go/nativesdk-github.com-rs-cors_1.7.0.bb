SUMMARY = "go.mod: github.com/rs/cors"
HOMEPAGE = "https://pkg.go.dev/github.com/rs/cors"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-rs-cors-sources.inc
EXTRA_DEPENDS += "\
    nativesdk-github.com-codegangsta-negroni \
    nativesdk-github.com-gin-gonic-gin \
    nativesdk-github.com-go-martini-martini \
    nativesdk-github.com-gobuffalo-buffalo \
    nativesdk-github.com-gorilla-mux \
    nativesdk-github.com-julienschmidt-httprouter \
    nativesdk-github.com-justinas-alice \
    nativesdk-github.com-martini-contrib-render \
    nativesdk-github.com-pressly-chi \
    nativesdk-github.com-zenazn-goji \
"
GO_IMPORT = "github.com/rs/cors"
inherit gosrc
inherit nativesdk
