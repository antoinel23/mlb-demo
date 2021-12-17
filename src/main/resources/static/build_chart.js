//The following script fill the graph charts
function build(statsChart, idCanvas, title) {
	if (statsChart.labels.length > 0) {
		var ctx = document.getElementById(idCanvas)
		var myChart = new Chart(ctx, {
			type: 'line',
			data: {
				labels: statsChart.labels,
				datasets: [{
					data: statsChart.data,
					label: title,
					borderColor: '#007bff',
					pointBackgroundColor: '#007bff'
				}]
			}
		})
	}
}