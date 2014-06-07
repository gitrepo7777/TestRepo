<html>
<head>
<script type="text/javascript" src="scripts/jquery-1.7.2.min.js"></script>
</head>
 
<body>
<h1>Get Delicious bookmark count with jQuery</h1>
 
URL : <input type='text' id='url' size='50' value='http://www.google.com' />
<br/><br/>
<h4>Delicious count : <span id="delicious_result"></span></h4>
 
<button id="delicious">Get Delicious Count (.Ajax)</button>
<button id="delicious2">Get Delicious Count (.getJSON)</button>
<script type="text/javascript">
 
$('#delicious').click(function(){
 
 $("#delicious_result").text("Loading......");
 
 var url = $('#url').val();
 
 $.ajax({ 
 type: "GET",
 dataType: "json",
 url: "http://feeds.delicious.com/v2/json/urlinfo/data?url="+url+"&amp;callback=?",
 success: function(data){
 
	var count = 0;
	if (data.length > 0) {
		count = data[0].total_posts;
	}
	$("#delicious_result").text(count + ' Saved');
 
   }
  });
});
 
$('#delicious2').click(function(){
 
 $("#delicious_result").text("Loading......");
 
 var url = $('#url').val();
 
 $.getJSON("http://feeds.delicious.com/v2/json/urlinfo/data?url="+url+"&amp;callback=?",
 
 function(data) {
 
	var count = 0;
	if (data.length > 0) {
		count = data[0].total_posts;
	}
	$("#delicious_result").text(count + ' Saved');
 
  });	
});
</script>
 
</body>
</html>