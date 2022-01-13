SUMMARY = "go.mod: github.com/codegangsta/cli"
HOMEPAGE = "https://pkg.go.dev/github.com/codegangsta/cli"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-codegangsta-cli-sources.inc
EXTRA_DEPENDS += "\
    nativesdk-github.com-burntsushi-toml \
    nativesdk-github.com-cpuguy83-go-md2man-v2 \
    nativesdk-github.com-urfave-cli \
    nativesdk-gopkg.in-yaml.v2 \
"
GO_IMPORT = "github.com/codegangsta/cli"
UPSTREAM_CHECK_GITHUB_TAGS = "1"
inherit gosrc
inherit nativesdk
