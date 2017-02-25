# Annotation-Bag
Collects all of the annotated classes in a code base based on configurations passed to the library.

# Intro
Annotations can tell a lot of information about your code base. If used accordingly they can show:
<ul>
<li> how many test methods you have</li>
<li> how many and which classes were created by Bob</li>

    @author("bob")
    
<li> a (class count/date) chart of how new functionality developed in comparison to the test base, which can serve as a proof of test driven development</li>

    @created("2/25/2017")
    
<li> a map of your requirements to your class names, where an id corresponds to a requirement</li>

    @spec("453")

</ul>
These are just some of the things you can do, but the possiblities are endless.
This library was developed to make it easier to extract this information from your code base as a whole.
