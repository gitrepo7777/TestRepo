/**
 * The root URL to the service endpoints.
 */
var BASE_URL='/weather';

/**
 * Sends the request to the server using XmlHttpRequest with the POST 
 * method. The content type will be determined by looking at the 
 * requested endpoint.
 */
function sendRequest()
{ 
  // Get the endpoint from the form   
  var endpoint = document.getElementById('endpoint').value;

  // Create the HTTP request
  var xmlHttp = getXmlHttpRequest();
  xmlHttp.open('POST', BASE_URL + endpoint, true);
  
  // Determine the proper content type
  if (endpoint.indexOf("xml") >= 0)
  {  
    xmlHttp.setRequestHeader("Accept", "application/xml");
    xmlHttp.setRequestHeader("Content-Type", "application/xml");
  }
  else
  {
    xmlHttp.setRequestHeader("Accept", "application/json");
    xmlHttp.setRequestHeader("Content-Type", "application/json");
  }
  
  // Register the response callback
  xmlHttp.onreadystatechange = function () {
    if (xmlHttp.readyState == 4)
    {    
      // Request is complete. Update the document to show the reponse.
      document.getElementById('response').firstChild.nodeValue = xmlHttp.responseText;
    }
  };

  // Get the request from the form
  var request = document.getElementById('request').value;
  
  // Send the request to the server
  xmlHttp.send(request);
}

/**
  * Gets an XMLHttpRequest while supporting Firefox and IE. This can
  * be handled automatically by more advanced frameworks like JQuery
  * or Prototype.
  *
  * @return a new XMLHttpRequest
  */
function getXmlHttpRequest()
{
  if (typeof(XMLHttpRequest)  === "undefined") 
  {
    return new ActiveXObject("Microsoft.XMLHTTP");
  }
  else
  {
    return new XMLHttpRequest();
  }
}


