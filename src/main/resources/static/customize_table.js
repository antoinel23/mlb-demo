//The following script customize the the tables
function customize(idTable, unsortable, unsearchable, order = [1, 'asc'], paging = false) {
	$(idTable).DataTable({
		"paging": paging,
		"columnDefs": [
			{ orderable: false, targets: unsortable },
			{ searchable: false, targets: unsearchable }
		],
		"order": [
			order
		]
	});
}