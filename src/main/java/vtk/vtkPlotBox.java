// java wrapper for vtkPlotBox object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPlotBox extends vtkPlot
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

  private native boolean Paint_4(vtkContext2D id0);
  public boolean Paint(vtkContext2D id0)
  {
    return Paint_4(id0);
  }

  private native void SetInputData_5(vtkTable id0);
  public void SetInputData(vtkTable id0)
  {
    SetInputData_5(id0);
  }

  private native void SetInputData_6(vtkTable id0,byte[] id1, int len1,byte[] id2, int len2);
  public void SetInputData(vtkTable id0,String id1,String id2)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    SetInputData_6(id0,bytes1, bytes1.length,bytes2, bytes2.length);
  }

  private native long GetLabels_7();
  public vtkStringArray GetLabels()
  {
    long temp = GetLabels_7();

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetLookupTable_8(vtkScalarsToColors id0);
  public void SetLookupTable(vtkScalarsToColors id0)
  {
    SetLookupTable_8(id0);
  }

  private native long GetLookupTable_9();
  public vtkScalarsToColors GetLookupTable()
  {
    long temp = GetLookupTable_9();

    if (temp == 0) return null;
    return (vtkScalarsToColors)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void CreateDefaultLookupTable_10();
  public void CreateDefaultLookupTable()
  {
    CreateDefaultLookupTable_10();
  }

  private native float GetBoxWidth_11();
  public float GetBoxWidth()
  {
    return GetBoxWidth_11();
  }

  private native void SetBoxWidth_12(float id0);
  public void SetBoxWidth(float id0)
  {
    SetBoxWidth_12(id0);
  }

  private native long GetTitleProperties_13();
  public vtkTextProperty GetTitleProperties()
  {
    long temp = GetTitleProperties_13();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean UpdateCache_14();
  public boolean UpdateCache()
  {
    return UpdateCache_14();
  }

  public vtkPlotBox() { super(); }

  public vtkPlotBox(long id) { super(id); }
  public native long   VTKInit();

}
