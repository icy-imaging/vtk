// java wrapper for vtkFrustumSource object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkFrustumSource extends vtkPolyDataAlgorithm
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

  private native long GetPlanes_4();
  public vtkPlanes GetPlanes()
  {
    long temp = GetPlanes_4();

    if (temp == 0) return null;
    return (vtkPlanes)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetPlanes_5(vtkPlanes id0);
  public void SetPlanes(vtkPlanes id0)
  {
    SetPlanes_5(id0);
  }

  private native boolean GetShowLines_6();
  public boolean GetShowLines()
  {
    return GetShowLines_6();
  }

  private native void SetShowLines_7(boolean id0);
  public void SetShowLines(boolean id0)
  {
    SetShowLines_7(id0);
  }

  private native void ShowLinesOn_8();
  public void ShowLinesOn()
  {
    ShowLinesOn_8();
  }

  private native void ShowLinesOff_9();
  public void ShowLinesOff()
  {
    ShowLinesOff_9();
  }

  private native double GetLinesLength_10();
  public double GetLinesLength()
  {
    return GetLinesLength_10();
  }

  private native void SetLinesLength_11(double id0);
  public void SetLinesLength(double id0)
  {
    SetLinesLength_11(id0);
  }

  private native long GetMTime_12();
  public long GetMTime()
  {
    return GetMTime_12();
  }

  private native void SetOutputPointsPrecision_13(int id0);
  public void SetOutputPointsPrecision(int id0)
  {
    SetOutputPointsPrecision_13(id0);
  }

  private native int GetOutputPointsPrecision_14();
  public int GetOutputPointsPrecision()
  {
    return GetOutputPointsPrecision_14();
  }

  public vtkFrustumSource() { super(); }

  public vtkFrustumSource(long id) { super(id); }
  public native long   VTKInit();

}
