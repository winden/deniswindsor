all "/", forward: "/index.groovy"
all "/index", forward: "/index.groovy"
all "/index.html", forward: "/index.groovy"

get "/udacity/hm1/hello", forward: "/udacity/hello.groovy"
all "/udacity/hm2/rot13", forward: "/udacity/rot13.groovy"

all "/disclaimer", forward: "/disclaimer.groovy"
all "/disclaimer.html", forward: "/disclaimer.groovy"

// routes for the blobstore service example
get "/upload",  forward: "/upload.gtpl"
get "/success", forward: "/success.gtpl"
get "/failure", forward: "/failure.gtpl"

get "/favicon.ico", redirect: "/images/dw_32.png"