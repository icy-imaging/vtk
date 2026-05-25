// java wrapper for vtkPlotBag object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPlotBag extends vtkPlotPoints
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

  private native long GetLabels_5();
  public vtkStringArray GetLabels()
  {
    long temp = GetLabels_5();

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetInputData_6(vtkTable id0);
  public void SetInputData(vtkTable id0)
  {
    SetInputData_6(id0);
  }

  private native void SetInputData_7(vtkTable id0,byte[] id1, int len1,byte[] id2, int len2);
  public void SetInputData(vtkTable id0,String id1,String id2)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    SetInputData_7(id0,bytes1, bytes1.length,bytes2, bytes2.length);
  }

  private native void SetInputData_8(vtkTable id0,byte[] id1, int len1,byte[] id2, int len2,byte[] id3, int len3);
  public void SetInputData(vtkTable id0,String id1,String id2,String id3)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    byte[] bytes3 = id3.getBytes(StandardCharsets.UTF_8);
    SetInputData_8(id0,bytes1, bytes1.length,bytes2, bytes2.length,bytes3, bytes3.length);
  }

  private native void SetInputData_9(vtkTable id0,long id1,long id2,long id3);
  public void SetInputData(vtkTable id0,long id1,long id2,long id3)
  {
    SetInputData_9(id0,id1,id2,id3);
  }

  private native void SetBagVisible_10(boolean id0);
  public void SetBagVisible(boolean id0)
  {
    SetBagVisible_10(id0);
  }

  private native boolean GetBagVisible_11();
  public boolean GetBagVisible()
  {
    return GetBagVisible_11();
  }

  private native void SetLinePen_12(vtkPen id0);
  public void SetLinePen(vtkPen id0)
  {
    SetLinePen_12(id0);
  }

  private native long GetLinePen_13();
  public vtkPen GetLinePen()
  {
    long temp = GetLinePen_13();

    if (temp == 0) return null;
    return (vtkPen)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetPointPen_14(vtkPen id0);
  public void SetPointPen(vtkPen id0)
  {
    SetPointPen_14(id0);
  }

  private native long GetPointPen_15();
  public vtkPen GetPointPen()
  {
    long temp = GetPointPen_15();

    if (temp == 0) return null;
    return (vtkPen)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean UpdateCache_16();
  public boolean UpdateCache()
  {
    return UpdateCache_16();
  }

  public vtkPlotBag() { super(); }

  public vtkPlotBag(long id) { super(id); }
  public native long   VTKInit();

}
