// java wrapper for vtkSubPixelPositionEdgels object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSubPixelPositionEdgels extends vtkPolyDataAlgorithm
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

  private native void SetGradMapsData_4(vtkStructuredPoints id0);
  public void SetGradMapsData(vtkStructuredPoints id0)
  {
    SetGradMapsData_4(id0);
  }

  private native long GetGradMaps_5();
  public vtkStructuredPoints GetGradMaps()
  {
    long temp = GetGradMaps_5();

    if (temp == 0) return null;
    return (vtkStructuredPoints)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetTargetFlag_6(int id0);
  public void SetTargetFlag(int id0)
  {
    SetTargetFlag_6(id0);
  }

  private native int GetTargetFlag_7();
  public int GetTargetFlag()
  {
    return GetTargetFlag_7();
  }

  private native void TargetFlagOn_8();
  public void TargetFlagOn()
  {
    TargetFlagOn_8();
  }

  private native void TargetFlagOff_9();
  public void TargetFlagOff()
  {
    TargetFlagOff_9();
  }

  private native void SetTargetValue_10(double id0);
  public void SetTargetValue(double id0)
  {
    SetTargetValue_10(id0);
  }

  private native double GetTargetValue_11();
  public double GetTargetValue()
  {
    return GetTargetValue_11();
  }

  public vtkSubPixelPositionEdgels() { super(); }

  public vtkSubPixelPositionEdgels(long id) { super(id); }
  public native long   VTKInit();

}
