SUMMARY = "go.mod: github.com/franela/goreq"
HOMEPAGE = "https://pkg.go.dev/github.com/franela/goreq"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "-1"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-franela-goreq-sources.inc

GO_IMPORT = "github.com/franela/goreq"

inherit gosrc
inherit native
