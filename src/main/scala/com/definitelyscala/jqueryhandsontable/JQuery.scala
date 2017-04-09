package com.definitelyscala.jqueryhandsontable

import scala.scalajs.js

@js.native
trait JQuery extends js.Object {
  def handsontable(): JQuery = js.native
  def handsontable(methodName: String, arguments: js.Any*): js.Dynamic = js.native
  def handsontable(options: Handsontable.Options): JQuery = js.native
}