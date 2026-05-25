// java wrapper for vtkTableToPolyData object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTableToPolyData extends vtkPolyDataAlgorithm
{

  private native int IsTypeOf_0(byte[] id0, int len0);
  public int IsTypeOf(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsTypeOf_0(bytes0, bytes0.length);
  }

  private native int IsA_1(byte[] id0, int len0);
  public int IsA(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsA_1(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBaseType_2(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBaseType(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBaseType_2(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBase_3(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBase(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBase_3(bytes0, bytes0.length);
  }

  private native void SetXColumn_4(byte[] id0, int len0);
  public void SetXColumn(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetXColumn_4(bytes0, bytes0.length);
  }

  private native byte[] GetXColumn_5();
  public String GetXColumn()
  {
    return new String(GetXColumn_5(), StandardCharsets.UTF_8);
  }

  private native void SetXColumnIndex_6(int id0);
  public void SetXColumnIndex(int id0)
  {
    SetXColumnIndex_6(id0);
  }

  private native int GetXColumnIndexMinValue_7();
  public int GetXColumnIndexMinValue()
  {
    return GetXColumnIndexMinValue_7();
  }

  private native int GetXColumnIndexMaxValue_8();
  public int GetXColumnIndexMaxValue()
  {
    return GetXColumnIndexMaxValue_8();
  }

  private native int GetXColumnIndex_9();
  public int GetXColumnIndex()
  {
    return GetXColumnIndex_9();
  }

  private native void SetXComponent_10(int id0);
  public void SetXComponent(int id0)
  {
    SetXComponent_10(id0);
  }

  private native int GetXComponentMinValue_11();
  public int GetXComponentMinValue()
  {
    return GetXComponentMinValue_11();
  }

  private native int GetXComponentMaxValue_12();
  public int GetXComponentMaxValue()
  {
    return GetXComponentMaxValue_12();
  }

  private native int GetXComponent_13();
  public int GetXComponent()
  {
    return GetXComponent_13();
  }

  private native void SetYColumn_14(byte[] id0, int len0);
  public void SetYColumn(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetYColumn_14(bytes0, bytes0.length);
  }

  private native byte[] GetYColumn_15();
  public String GetYColumn()
  {
    return new String(GetYColumn_15(), StandardCharsets.UTF_8);
  }

  private native void SetYColumnIndex_16(int id0);
  public void SetYColumnIndex(int id0)
  {
    SetYColumnIndex_16(id0);
  }

  private native int GetYColumnIndexMinValue_17();
  public int GetYColumnIndexMinValue()
  {
    return GetYColumnIndexMinValue_17();
  }

  private native int GetYColumnIndexMaxValue_18();
  public int GetYColumnIndexMaxValue()
  {
    return GetYColumnIndexMaxValue_18();
  }

  private native int GetYColumnIndex_19();
  public int GetYColumnIndex()
  {
    return GetYColumnIndex_19();
  }

  private native void SetYComponent_20(int id0);
  public void SetYComponent(int id0)
  {
    SetYComponent_20(id0);
  }

  private native int GetYComponentMinValue_21();
  public int GetYComponentMinValue()
  {
    return GetYComponentMinValue_21();
  }

  private native int GetYComponentMaxValue_22();
  public int GetYComponentMaxValue()
  {
    return GetYComponentMaxValue_22();
  }

  private native int GetYComponent_23();
  public int GetYComponent()
  {
    return GetYComponent_23();
  }

  private native void SetZColumn_24(byte[] id0, int len0);
  public void SetZColumn(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetZColumn_24(bytes0, bytes0.length);
  }

  private native byte[] GetZColumn_25();
  public String GetZColumn()
  {
    return new String(GetZColumn_25(), StandardCharsets.UTF_8);
  }

  private native void SetZColumnIndex_26(int id0);
  public void SetZColumnIndex(int id0)
  {
    SetZColumnIndex_26(id0);
  }

  private native int GetZColumnIndexMinValue_27();
  public int GetZColumnIndexMinValue()
  {
    return GetZColumnIndexMinValue_27();
  }

  private native int GetZColumnIndexMaxValue_28();
  public int GetZColumnIndexMaxValue()
  {
    return GetZColumnIndexMaxValue_28();
  }

  private native int GetZColumnIndex_29();
  public int GetZColumnIndex()
  {
    return GetZColumnIndex_29();
  }

  private native void SetZComponent_30(int id0);
  public void SetZComponent(int id0)
  {
    SetZComponent_30(id0);
  }

  private native int GetZComponentMinValue_31();
  public int GetZComponentMinValue()
  {
    return GetZComponentMinValue_31();
  }

  private native int GetZComponentMaxValue_32();
  public int GetZComponentMaxValue()
  {
    return GetZComponentMaxValue_32();
  }

  private native int GetZComponent_33();
  public int GetZComponent()
  {
    return GetZComponent_33();
  }

  private native void SetCreate2DPoints_34(boolean id0);
  public void SetCreate2DPoints(boolean id0)
  {
    SetCreate2DPoints_34(id0);
  }

  private native boolean GetCreate2DPoints_35();
  public boolean GetCreate2DPoints()
  {
    return GetCreate2DPoints_35();
  }

  private native void Create2DPointsOn_36();
  public void Create2DPointsOn()
  {
    Create2DPointsOn_36();
  }

  private native void Create2DPointsOff_37();
  public void Create2DPointsOff()
  {
    Create2DPointsOff_37();
  }

  private native void SetPreserveCoordinateColumnsAsDataArrays_38(boolean id0);
  public void SetPreserveCoordinateColumnsAsDataArrays(boolean id0)
  {
    SetPreserveCoordinateColumnsAsDataArrays_38(id0);
  }

  private native boolean GetPreserveCoordinateColumnsAsDataArrays_39();
  public boolean GetPreserveCoordinateColumnsAsDataArrays()
  {
    return GetPreserveCoordinateColumnsAsDataArrays_39();
  }

  private native void PreserveCoordinateColumnsAsDataArraysOn_40();
  public void PreserveCoordinateColumnsAsDataArraysOn()
  {
    PreserveCoordinateColumnsAsDataArraysOn_40();
  }

  private native void PreserveCoordinateColumnsAsDataArraysOff_41();
  public void PreserveCoordinateColumnsAsDataArraysOff()
  {
    PreserveCoordinateColumnsAsDataArraysOff_41();
  }

  public vtkTableToPolyData() { super(); }

  public vtkTableToPolyData(long id) { super(id); }
  public native long   VTKInit();

}
