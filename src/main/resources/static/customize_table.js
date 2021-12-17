//The following script customize the the tables
function customize(idTable, unsortable, unsearchable) {
	$(idTable).DataTable({
		"paging": false,
		"columnDefs": [
			{ orderable: false, targets: unsortable },
			{ searchable: false, targets: unsearchable }
		],
		"order": [
			[1, 'asc']
		]
	});
}