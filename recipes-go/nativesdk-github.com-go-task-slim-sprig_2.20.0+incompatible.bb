SUMMARY = "go.mod: github.com/go-task/slim-sprig"
HOMEPAGE = "https://pkg.go.dev/github.com/go-task/slim-sprig"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-go-task-slim-sprig-sources.inc
EXTRA_DEPENDS += "\
    nativesdk-github.com-google-uuid \
    nativesdk-github.com-huandu-xstrings \
    nativesdk-github.com-imdario-mergo \
    nativesdk-github.com-masterminds-goutils \
    nativesdk-github.com-masterminds-semver \
    nativesdk-golang.org-x-crypto \
"
GO_IMPORT = "github.com/go-task/slim-sprig"
inherit gosrc
inherit nativesdk
