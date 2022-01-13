SUMMARY = "go.mod: github.com/gobuffalo/meta"
HOMEPAGE = "https://pkg.go.dev/github.com/gobuffalo/meta"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-gobuffalo-meta-sources.inc
EXTRA_DEPENDS += "\
    nativesdk-github.com-burntsushi-toml \
    nativesdk-github.com-gobuffalo-envy \
    nativesdk-github.com-gobuffalo-flect \
    nativesdk-github.com-rogpeppe-go-internal \
"
GO_IMPORT = "github.com/gobuffalo/meta"
inherit gosrc
inherit nativesdk
