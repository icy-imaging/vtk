// java wrapper for vtkPlot3D object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPlot3D extends vtkContextItem
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

  private native void SetPen_4(vtkPen id0);
  public void SetPen(vtkPen id0)
  {
    SetPen_4(id0);
  }

  private native long GetPen_5();
  public vtkPen GetPen()
  {
    long temp = GetPen_5();

    if (temp == 0) return null;
    return (vtkPen)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetSelectionPen_6(vtkPen id0);
  public void SetSelectionPen(vtkPen id0)
  {
    SetSelectionPen_6(id0);
  }

  private native long GetSelectionPen_7();
  public vtkPen GetSelectionPen()
  {
    long temp = GetSelectionPen_7();

    if (temp == 0) return null;
    return (vtkPen)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetInputData_8(vtkTable id0);
  public void SetInputData(vtkTable id0)
  {
    SetInputData_8(id0);
  }

  private native void SetInputData_9(vtkTable id0,byte[] id1, int len1,byte[] id2, int len2,byte[] id3, int len3);
  public void SetInputData(vtkTable id0,String id1,String id2,String id3)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    byte[] bytes3 = id3.getBytes(StandardCharsets.UTF_8);
    SetInputData_9(id0,bytes1, bytes1.length,bytes2, bytes2.length,bytes3, bytes3.length);
  }

  private native void SetInputData_10(vtkTable id0,byte[] id1, int len1,byte[] id2, int len2,byte[] id3, int len3,byte[] id4, int len4);
  public void SetInputData(vtkTable id0,String id1,String id2,String id3,String id4)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    byte[] bytes3 = id3.getBytes(StandardCharsets.UTF_8);
    byte[] bytes4 = id4.getBytes(StandardCharsets.UTF_8);
    SetInputData_10(id0,bytes1, bytes1.length,bytes2, bytes2.length,bytes3, bytes3.length,bytes4, bytes4.length);
  }

  private native void SetInputData_11(vtkTable id0,long id1,long id2,long id3);
  public void SetInputData(vtkTable id0,long id1,long id2,long id3)
  {
    SetInputData_11(id0,id1,id2,id3);
  }

  private native void SetColors_12(vtkDataArray id0);
  public void SetColors(vtkDataArray id0)
  {
    SetColors_12(id0);
  }

  private native long GetVTKPoints_13();
  public vtkPoints GetVTKPoints()
  {
    long temp = GetVTKPoints_13();

    if (temp == 0) return null;
    return (vtkPoints)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetChart_14();
  public vtkChartXYZ GetChart()
  {
    long temp = GetChart_14();

    if (temp == 0) return null;
    return (vtkChartXYZ)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetChart_15(vtkChartXYZ id0);
  public void SetChart(vtkChartXYZ id0)
  {
    SetChart_15(id0);
  }

  private native byte[] GetXAxisLabel_16();
  public String GetXAxisLabel()
  {
    return new String(GetXAxisLabel_16(), StandardCharsets.UTF_8);
  }

  private native byte[] GetYAxisLabel_17();
  public String GetYAxisLabel()
  {
    return new String(GetYAxisLabel_17(), StandardCharsets.UTF_8);
  }

  private native byte[] GetZAxisLabel_18();
  public String GetZAxisLabel()
  {
    return new String(GetZAxisLabel_18(), StandardCharsets.UTF_8);
  }

  private native void SetSelection_19(vtkIdTypeArray id0);
  public void SetSelection(vtkIdTypeArray id0)
  {
    SetSelection_19(id0);
  }

  private native long GetSelection_20();
  public vtkIdTypeArray GetSelection()
  {
    long temp = GetSelection_20();

    if (temp == 0) return null;
    return (vtkIdTypeArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkPlot3D() { super(); }

  public vtkPlot3D(long id) { super(id); }

}
