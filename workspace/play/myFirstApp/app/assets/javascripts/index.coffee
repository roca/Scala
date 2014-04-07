$ ->
	$.get "/listSamples", (data) ->
		$.each data, (index, item) ->
			$("#samples").append "<li>Sample (" + item.id + ")" + item.name + "</li>"