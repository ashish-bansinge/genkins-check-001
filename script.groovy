def buildApp() {
    echo 'building the application...'
} 

def testApp() {
    echo 'testing the application...'
} 

def deployApp() {
    echo 'deplying the application... On Local'
    echo "deploying version ${params.VERSION}"
} 

return this
