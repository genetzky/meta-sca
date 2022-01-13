SUMMARY = "go.mod: github.com/gobuffalo/buffalo"
HOMEPAGE = "https://pkg.go.dev/github.com/gobuffalo/buffalo"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-gobuffalo-buffalo-sources.inc
EXTRA_DEPENDS += "\
    nativesdk-github.com-burntsushi-toml \
    nativesdk-github.com-dustin-go-humanize \
    nativesdk-github.com-fatih-color \
    nativesdk-github.com-gobuffalo-attrs \
    nativesdk-github.com-gobuffalo-buffalo-pop-v2 \
    nativesdk-github.com-gobuffalo-clara-v2 \
    nativesdk-github.com-gobuffalo-envy \
    nativesdk-github.com-gobuffalo-events \
    nativesdk-github.com-gobuffalo-flect \
    nativesdk-github.com-gobuffalo-genny-v2 \
    nativesdk-github.com-gobuffalo-github-flavored-markdown \
    nativesdk-github.com-gobuffalo-helpers \
    nativesdk-github.com-gobuffalo-httptest \
    nativesdk-github.com-gobuffalo-logger \
    nativesdk-github.com-gobuffalo-meta \
    nativesdk-github.com-gobuffalo-nulls \
    nativesdk-github.com-gobuffalo-packd \
    nativesdk-github.com-gobuffalo-packr-v2 \
    nativesdk-github.com-gobuffalo-plush-v4 \
    nativesdk-github.com-gobuffalo-pop-v5 \
    nativesdk-github.com-gobuffalo-tags-v3 \
    nativesdk-github.com-gorilla-handlers \
    nativesdk-github.com-gorilla-mux \
    nativesdk-github.com-gorilla-sessions \
    nativesdk-github.com-karrick-godirwalk \
    nativesdk-github.com-markbates-grift \
    nativesdk-github.com-markbates-oncer \
    nativesdk-github.com-markbates-refresh \
    nativesdk-github.com-markbates-safe \
    nativesdk-github.com-markbates-sigtx \
    nativesdk-github.com-monoculum-formam \
    nativesdk-github.com-sirupsen-logrus \
    nativesdk-github.com-spf13-cobra \
    nativesdk-github.com-spf13-pflag \
    nativesdk-github.com-spf13-viper \
    nativesdk-github.com-stretchr-testify \
    nativesdk-golang.org-x-sync \
    nativesdk-golang.org-x-tools \
    nativesdk-gopkg.in-alexcesaro-quotedprintable.v3 \
"
GO_IMPORT = "github.com/gobuffalo/buffalo"
inherit gosrc
inherit nativesdk
