SUMMARY = "go.mod: github.com/mozilla/scribe"
HOMEPAGE = "https://pkg.go.dev/github.com/mozilla/scribe"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-mozilla-scribe-sources.inc
EXTRA_DEPENDS += "\
    nativesdk-github.com-lib-pq \
    nativesdk-gopkg.in-yaml.v2 \
"
GO_IMPORT = "github.com/mozilla/scribe"
inherit gosrc
inherit nativesdk
