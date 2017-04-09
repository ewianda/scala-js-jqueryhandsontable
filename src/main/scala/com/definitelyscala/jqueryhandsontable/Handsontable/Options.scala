package com.definitelyscala.jqueryhandsontable.Handsontable

import scala.scalajs.js
import org.scalajs.dom.raw._
import scala.scalajs.js.|

@js.native
trait Options extends js.Object {
  /**
   * Initial data source that will be bound to the data grid by reference (editing data grid alters the data source. See Understanding binding as reference.
   */
  var data: js.Any = js.native
  /**
   * Width of the grid. Can be a number or a function that returns a number.
   */
  var width: js.Any = js.native
  /**
   * Height of the grid. Can be a number or a function that returns a number.
   */
  var height: js.Any = js.native
  /**
   * Minimum number of rows. At least that many of rows will be created during initialization.
   */
  var minRows: Double = js.native
  /**
   * Minimum number of columns. At least that many of columns will be created during initialization.
   */
  var minCols: Double = js.native
  /**
   * Maximum number of rows.
   */
  var maxRows: Double = js.native
  /**
   * Maximum number of columns.
   */
  var maxCols: Double = js.native
  /**
   * Initial number of rows. Notice: This option only has effect in Handsontable constructor and only if data option is not provided.
   */
  var startRows: Double = js.native
  /**
   * Initial number of rows. Notice: This option only has effect in Handsontable constructor and only if data option is not provided.
   */
  var startCols: Double = js.native
  /**
   * Setting true or false will enable or disable the default row headers (1, 2, 3). You can also define an array ['One', 'Two', 'Three', ...] or a function to define the headers. If a function is set the index of the rowis passed as a parameter.
   */
  var rowHeaders: js.Any = js.native
  /**
   * Setting true or false will enable or disable the default column headers (A, B, C). You can also define an array ['One', 'Two', 'Three', ...] or a function to define the headers. If a function is set the index of the column is passed as a parameter.
   */
  var colHeaders: js.Any = js.native
  /**
   * Defines column widths in pixels. Accepts number, string (that will be converted to number), array of numbers (if you want to define column width separately for each column) or a function (if you want to set column width dynamically on each render).
   */
  var colWidths: js.Any = js.native
  /**
   * Defines the cell properties and data binding for certain columns. Notice: Using this option sets a fixed number of columns (options startCols, minCols, maxCols will be ignored).
   * @see https://github.com/handsontable/jquery-handsontable/wiki/Options below for more detailed explanation.
   * @see http://handsontable.com/demo/datasources.html for examples
   */
  var columns: js.Array[js.Any] = js.native
  /**
   * Defines the cell properties for given row, col, prop coordinates.
   * See Cells section below for more detailed explanation.
   */
  var cells: js.Function3[Double, Double, String, Unit] = js.native
  /**
   * Defines the structure of a new row when data source is an object.
   * @see http://handsontable.com/demo/datasources.html for examples.
   */
  var dataSchema: js.Any = js.native
  /**
   * When set to 1 (or more), Handsontable will add a new row at the end of grid if there are no more empty rows.
   */
  var minSpareRows: Double = js.native
  /**
   * When set to 1 (or more), Handsontable will add a new column at the end of grid if there are no more empty columns.
   */
  var minSpareCols: Double = js.native
  /**
   * If true, selection of multiple cells using keyboard or mouse is allowed.
   */
  var multiSelect: Boolean = js.native
  /**
   * Enables the fill handle (drag-down and copy-down) functionality, which shows the small rectangle in bottom right corner of the selected area, that let's you expand values to the adjacent cells.
   * Possible values: true (to enable in all directions), "vertical" or "horizontal" (to enable in one direction), false (to disable completely). Setting to true enables the fillHandle plugin, which,
   */
  var fillHandle: js.Any = js.native
  /**
   * Defines if the right-click context menu should be enabled. Context menu allows to create new row or column at any place in the grid.
   * Possible values: true (to enable basic options), false (to disable completely) or array of any available strings: ["row_above", "row_below", "col_left", "col_right", "remove_row", "remove_col", "undo", "redo", "sep1", "sep2", "sep3"].
   * @see http://handsontable.com/demo/contextmenu.html for examples.
   */
  var contextMenu: js.Any = js.native
  /**
   * If true, undo/redo functionality is enabled.
   */
  var undo: Boolean = js.native
  /**
   * If true, mouse click outside the grid will deselect the current selection.
   */
  var outsideClickDeselects: Boolean = js.native
  /**
   * If true, ENTER begins editing mode (like Google Docs). If false, ENTER moves to next row (like Excel) and adds new row if necessary. TAB adds new column if necessary.
   */
  var enterBeginsEditing: Boolean = js.native
  /**
   * Defines cursor move after ENTER is pressed (SHIFT+ENTER uses negative vector). Can be an object or a function that returns an object. The event argument passed to the function is a jQuery.Event object received after a ENTER key has been pressed. This event object can be used to check whether user pressed ENTER or SHIFT + ENTER.
   */
  var enterMoves: js.Any = js.native
  /**
   * Defines cursor move after TAB is pressed (SHIFT+TAB uses negative vector). Can be an object or a function that returns an object. The event argument passed to the function is a jQuery.Event object received after a TAB key has been pressed. This event object can be used to check whether user pressed TAB or SHIFT + TAB.
   */
  var tabMoves: js.Any = js.native
  /**
   * If true, pressing TAB or right arrow in the last column will move to first column in next row.
   */
  var autoWrapRow: Boolean = js.native
  /**
   * If true, pressing ENTER or down arrow in the last row will move to first row in next column.
   */
  var autoWrapCol: Boolean = js.native
  /**
   * Autocomplete definitions.
   * @see demo/autocomplete.html for examples and definitions.
   */
  var autoComplete: js.Array[js.Any] = js.native
  /**
   * Maximum number of rows than can be copied to clipboard using CTRL+C.
   */
  var copyRowsLimit: Double = js.native
  /**
   * Maximum number of columns than can be copied to clipboard using CTRL+C.
   */
  var copyColsLimit: Double = js.native
  /**
   * Defines paste (CTRL+V) behavior. Default value "overwrite" will paste clipboard value over current selection.
   * When set to "shift_down", clipboard data will be pasted in place of current selection, while all selected cells are moved down.
   * When set to "shift_right", clipboard data will be pasted in place of current selection, while all selected cells are moved right.
   */
  var pasteMode: String = js.native
  /**
   * Column stretching mode. Possible values: "none", "last", "all".
   */
  var stretchH: String = js.native
  /**
   * Lets you overwrite the default isEmptyRow method.
   */
  var isEmptyRow: js.Function1[Double, Boolean] = js.native
  /**
   * Lets you overwrite the default isEmptyCol method.
   */
  var isEmptyCol: js.Function1[Double, Boolean] = js.native
  /**
   * Turn on Manual column resize, if set to a boolean or define initial column resized widths, if set to an array of numbers.
   */
  var manualColumnResize: js.Any = js.native
  /**
   * Turn on Manual column move, if set to a boolean or define initial column order, if set to an array of column indexes.
   */
  var manualColumnMove: js.Any = js.native
  /**
   * Turn on Column sorting.
   */
  var columnSorting: Boolean = js.native
  /**
   * Turn on saving the state of column sorting, columns positions and columns sizes in local storage. For more information see How to save data localy.
   */
  var persistentState: Boolean = js.native
  /**
   * Class name for all visible rows in current selection.
   */
  var currentRowClassName: String = js.native
  /**
   * Class name for all visible columns in current selection.
   */
  var currentColClassName: String = js.native
  /**
   * Allows to specify the number of rows fixed (aka freezed) on the top of the table.
   */
  var fixedRowsTop: Double = js.native
  /**
   * Allows to specify the number of columns fixed (aka freezed) on the left side of the table.
   */
  var fixedColumnsLeft: Double = js.native
  /**
   * Setting to true enables selecting just a fragment of the text within a single cell or between adjacent cells.
   */
  var fragmentSelection: Boolean = js.native
  /**
   * Setting to true word wrapping of the cell text content that does not fit in the fixed column width.
   */
  var wordWrap: Boolean = js.native
  /**
   * CSS class name cells configured with wordWrap: false.
   */
  var noWordWrapClassName: String = js.native
  /**
   * When set to an non-empty string, displayed as the cell content for empty cells.
   */
  var placeholder: js.Any = js.native
  /**
   * CSS class name for cells that have a placeholder in use.
   */
  var placeholderCellClassName: String = js.native
  /**
   * CSS class name for cells that did not pass validation.
   */
  var invalidCellClassName: String = js.native
  /**
   * CSS class name for read-only cells.
   */
  var readOnlyCellClassName: String = js.native
  /**
   * Setting to true enables the debug mode, currently used to test the correctness of the row and column header fixed positioning on a layer above the master table.
   */
  var debug: Boolean = js.native
  /**
   * When set to true, the table is rerendered when it is detected that it was made visible in DOM.
   */
  var observeDOMVisibility: Boolean = js.native
  /**
   * Setting to true enables the autoColumnSize plugin, which makes sure each column gets enough space to show its content.
   */
  var autoColumnSize: Boolean | Object = js.native
  /**
   * Setting to true enables the observeChanges plugin, which automatically renders the table when a change in the data source is observed.
   */
  var observeChanges: Boolean = js.native
  /**
   * Setting to true enables the manualRowResize plugin, which allows to resize the row height with your mouse.
   */
  var manualRowResize: Boolean = js.native
  /**
   * Turns on Manual row move, if set to a boolean or define initial row order, if set to an array of row indexes.
   */
  var manualRowMove: Boolean = js.native
  /**
   * Setting to true enables the copyPaste plugin, which enables the copying and pasting to the clipboard.
   */
  var copyPaste: Boolean = js.native
  /**
   * Setting to true enables the search plugin (see demo).
   */
  var search: Boolean = js.native
  /**
   * Setting to true or array enables the mergeCells plugin, which enables the merging of the cells. (see demo). You can provide the merged cells on the pageload if you feed the mergeCells option with an array.
   */
  var mergeCells: js.Any = js.native
  /**
   * Callback fired before Walkontable instance is initiated.
   */
  var beforeInitWalkontable: js.Function = js.native
  /**
   * Callback fired before Handsontable instance is initiated.
   * Note: this can be set only by global PluginHooks instance.
   */
  var beforeInit: js.Function = js.native
  /**
   * Callback fired before Handsontable table is rendered. Parameters:
   *   - isForced is true if rendering was triggered by a change of settings or data; or false if rendering was triggered by scrolling or moving selection.
   */
  var beforeRender: js.Function1[Boolean, Unit] = js.native
  /**
   * Callback fired before one or more cells is changed. Its main purpose is to alter changes silently before input. Parameters:
   *   - changes is a 2D array containing information about each of the edited cells [ [row, prop, oldVal, newVal], ... ].
   *     - To disregard a single change, set changes[i] to null or remove it from array using changes.splice(i, 1).
   *     - To alter a single change, overwrite the desired value to changes[i][3].
   *     - To cancel all edit, return false from the callback or set array length to 0 (changes.length = 0).
   *   - source is the name of a source of changes.
   */
  var beforeChange: js.Function2[js.Array[js.Array[js.Any]], String, Unit] = js.native
  var beforeChangeRender: js.Function = js.native
  /**
   * Callback fired before sorting the table. The column argument is a relative (displayed) index of a column that is about to be sorted. To get the absolute column index, just add the current column offset. You can get the offset by using colOffset() method.
   */
  var beforeColumnSort: js.Function2[Double, Boolean, Unit] = js.native
  /**
   * Callback fired before setting single value from the data source array.
   */
  var beforeSet: js.Function1[Object, Unit] = js.native
  /**
   * Callback fired before getting cell settings.
   */
  var beforeGetCellMeta: js.Function3[Double, Double, Object, Unit] = js.native
  /**
   * Parameters:
   *   - start is an object containing information about first filled cell: { row : 2, col : 0 }.
   *   - end is an object containing information about last filled cell: { row : 4, col : 1 }.
   *   - data is an 2D array containing information about fill pattern: [ ["1", "Ted"], ["1", "John"] ].
   */
  var beforeAutofill: js.Function3[CellPosition, CellPosition, js.Array[js.Array[String]], Unit] = js.native
  /**
   * Callback fired before keydown event is handled. It can be used to overwrite default key bindings. Caution - in your beforeKeyDown handler you need to call event.stopImmediatePropagation() to prevent default key behavior.
   */
  var beforeKeyDown: js.Function1[KeyboardEvent, Unit] = js.native
  /**
   * A plugin hook executed before validator function, only if validator function is defined. This can be used to manipulate value of changed cell before it is applied to the validator function. NOTICE: this will not affect values of changes. This will change value ONLY for validation!
   */
  var beforeValidate: js.Function4[js.Any, Double, String, String, Unit] = js.native
  /**
   * Callback fired after Handsontable instance is initiated.
   */
  var afterInit: js.Function = js.native
  /**
   * Callback fired after new data is loaded (by loadData method) into the data source array.
   */
  var afterLoadData: js.Function = js.native
  /**
   * Callback fired after Handsontable table is rendered. Parameters:
   *   - isForced is true if rendering was triggered by a change of settings or data; or false if rendering was triggered by scrolling or moving selection.
   */
  var afterRender: js.Function1[Boolean, Unit] = js.native
  /**
   * Callback fired after one or more cells is changed. Its main use case is to save the input. Parameters:
   *   - changes is a 2D array containing information about each of the edited cells [ [row, prop, oldVal, newVal], ... ].
   *   - source is one of the strings: "alter", "empty", "edit", "populateFromArray", "loadData", "autofill", "paste".
   * Note: for performance reasons, the changes array is null for "loadData" source.
   */
  var afterChange: js.Function2[js.Array[js.Any], String, Unit] = js.native
  /**
   * Callback fired after sorting the table. The column argument is a relative (displayed) index of a column that is about to be sorted. To get the absolute column index, just add the current column offset. You can get the offset by using colOffset() method.
   */
  var afterColumnSort: js.Function2[Double, Boolean, Unit] = js.native
  /**
   * Callback fired while one or more cells are being selected (on mouse move). Parameters:
   *   - r selection start row
   *   - c selection start column
   *   - r2 selection end row
   *   - c2 selection end column
   */
  var afterSelection: js.Function4[Double, Double, Double, Double, Unit] = js.native
  /**
   * The same as above, but data source object property name is used instead of the column number.
   */
  var afterSelectionByProp: js.Function4[Double, String, Double, String, Unit] = js.native
  /**
   * Callback fired while one or more cells are being selected (on mouse up). Parameters:
   *   - r selection start row
   *   - c selection start column
   *   - r2 selection end row
   *   - c2 selection end column
   */
  var afterSelectionEnd: js.Function4[Double, Double, Double, Double, Unit] = js.native
  /**
   * The same as above, but data source object property name is used instead of the column number.
   */
  var afterSelectionEndByProp: js.Function4[Double, String, Double, String, Unit] = js.native
  /**
   * Event called when current cell is deselected.
   */
  var afterDeselect: js.Function = js.native
  /**
   * Callback fired after getting cell settings.
   */
  var afterGetCellMeta: js.Function3[Double, Double, Object, Unit] = js.native
  /**
   * Callback fired after getting info about column header.
   */
  var afterGetColHeader: js.Function2[Double, HTMLTableHeaderCellElement, Unit] = js.native
  /**
   * Callback fired after calculating column width.
   */
  var afterGetColWidth: js.Function2[Double, Object, Unit] = js.native
  /**
   * Callback fired after destroing Handsontable instance.
   */
  var afterDestroy: js.Function = js.native
  /**
   * Callback is fired when a new row is created. Parameters:
   *   - index represents the index of first newly created row in the data source array.
   *   - amount number of newly created rows in the data source array.
   */
  var afterCreateRow: js.Function2[Double, Double, Unit] = js.native
  /**
   * Callback is fired when a new column is created. Parameters:
   *   - index represents the index of first newly created column in the data source array.
   *   - amount number of newly created columns in the data source array.
   */
  var afterCreateCol: js.Function2[Double, Double, Unit] = js.native
  /**
   * Callback is fired when one or more rows are about to be removed. Parameters:
   *   - index is an index of starter row.
   *   - amount is an anount of rows to be removed.
   */
  var beforeRemoveRow: js.Function2[Double, Double, Unit] = js.native
  /**
   * Callback is fired when one or more rows are removed. Parameters:
   *   - index is an index of starter row.
   *   - amount is an anount of removed rows.
   */
  var afterRemoveRow: js.Function2[Double, Double, Unit] = js.native
  /**
   * Callback is fired when one or more columns are about to be removed. Parameters:
   *   - index is an index of starter column.
   *   - amount is an anount of columns to be removed.
   */
  var beforeRemoveCol: js.Function2[Double, Double, Unit] = js.native
  /**
   * Callback is fired when one or more columns are removed. Parameters:
   *   - index is an index of starter column.
   *   - amount is an anount of removed columns.
   */
  var afterRemoveCol: js.Function2[Double, Double, Unit] = js.native
  /**
   * Callback is fired after changing column size.
   */
  var afterColumnResize: js.Function2[Double, Double, Unit] = js.native
  /**
   * Callback is fired after changing column placement.
   */
  var afterColumnMove: js.Function2[Double, Double, Unit] = js.native
  /**
   * Callback fired if copyRowsLimit or copyColumnsLimit was reached.
   */
  var afterCopyLimit: js.Function4[Double, Double, Double, Double, Unit] = js.native
  /**
   * A plugin hook executed after validator function, only if validator function is defined. Validation result is the first parameter. This can be used to determinate if validation passed successfully or not. You can cancel current change by returning false.
   */
  var afterValidate: js.Function5[Boolean, js.Any, Double, String, String, Boolean] = js.native
  /**
   * Callback fired before setting range is ended. Parameters:
   *   - coords is WalkontableCellCoords array
   */
  var beforeSetRangeEnd: js.Function1[js.Array[js.Any], Unit] = js.native
  var afterUpdateSettings: js.Function = js.native
  var afterRenderer: js.Function6[HTMLTableDataCellElement, Double, Double, String, String, Object, Unit] = js.native
  /**
   * Callback fired after clicking on a cell or row/column header.
   * In case the row/column header was clicked, the index is negative. For example clicking on the row header of cell (0, 0) results with afterOnCellMouseDown called with coords {row: 0, col: -1}.
   */
  var afterOnCellMouseDown: js.Function3[MouseEvent, CellPosition, HTMLTableDataCellElement, Unit] = js.native
  /**
   * Callback fired after hovering a cell or row/column header with the mouse cursor.
   * In case the row/column header was hovered, the index is negative. For example clicking on the row header of cell (0, 0) results with afterOnCellMouseOver called with coords {row: 0, col: -1}.
   */
  var afterOnCellMouseOver: js.Function3[MouseEvent, CellPosition, HTMLTableDataCellElement, Unit] = js.native
  /**
   * Callback fired after.
   */
  var afterOnCellCornerMouseDown: js.Function1[MouseEvent, Unit] = js.native
  var afterScrollVertically: js.Function = js.native
  var afterScrollHorizontally: js.Function = js.native
  /**
   * Callback fired after reset cell's meta.
   */
  var afterCellMetaReset: js.Function = js.native
  /**
   * Callback fired after modify column's width.
   */
  var modifyColWidth: js.Function2[Double, Double, Unit] = js.native
  /**
   * Callback fired after modify hight of row.
   */
  var modifyRowHeight: js.Function2[Double, Double, Unit] = js.native
  /**
   * Callback fired after row modify.
   */
  var modifyRow: js.Function1[Double, Unit] = js.native
  /**
   * Callback fired after column modify.
   */
  var modifyCol: js.Function1[Double, Unit] = js.native
  var afterSetCellMeta: js.Function = js.native
  /**
   * Deprecated! Now event is called afterSelection.
   */
  var onSelection: js.Function4[Double, Double, Double, Double, Unit] = js.native
  /**
   * Deprecated! Now event is called afterSelectionByProp.
   */
  var onSelectionByProp: js.Function4[Double, Double, Double, Double, Unit] = js.native
  /**
   * Deprecated! Now event is called afterSelectionEnd.
   */
  var onSelectionEnd: js.Function4[Double, Double, Double, Double, Unit] = js.native
  /**
   * Deprecated! Now event is called afterSelectionEndByProp.
   */
  var onSelectionEndByProp: js.Function4[Double, Double, Double, Double, Unit] = js.native
  /**
   * Deprecated! Now event is called beforeChange.
   */
  var onBeforeChange: js.Function2[js.Array[js.Any], String, Unit] = js.native
  /**
   * Deprecated! Now event is called afterChange.
   */
  var onChange: js.Function2[js.Array[js.Any], String, Unit] = js.native
  /**
   * Deprecated! Now event is called afterCopyLimit.
   */
  var onCopyLimit: js.Function4[Double, Double, Double, Double, Unit] = js.native
}