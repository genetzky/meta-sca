SUMMARY = "go.mod: github.com/quasilyte/go-consistent"
HOMEPAGE = "https://pkg.go.dev/github.com/quasilyte/go-consistent"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-quasilyte-go-consistent-sources.inc
EXTRA_DEPENDS += "\
    nativesdk-github.com-go-toolsmith-astcast \
    nativesdk-github.com-go-toolsmith-astequal \
    nativesdk-github.com-go-toolsmith-astinfo \
    nativesdk-github.com-go-toolsmith-pkgload \
    nativesdk-github.com-go-toolsmith-typep \
    nativesdk-github.com-kisielk-gotool \
    nativesdk-golang.org-x-tools \
"
GO_IMPORT = "github.com/quasilyte/go-consistent"
inherit gosrc
inherit nativesdk
