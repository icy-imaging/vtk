// java wrapper for vtkExtractEdges object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkExtractEdges extends vtkPolyDataAlgorithm
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

  private native void SetLocator_4(vtkIncrementalPointLocator id0);
  public void SetLocator(vtkIncrementalPointLocator id0)
  {
    SetLocator_4(id0);
  }

  private native long GetLocator_5();
  public vtkIncrementalPointLocator GetLocator()
  {
    long temp = GetLocator_5();

    if (temp == 0) return null;
    return (vtkIncrementalPointLocator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void CreateDefaultLocator_6();
  public void CreateDefaultLocator()
  {
    CreateDefaultLocator_6();
  }

  private native void SetUseAllPoints_7(boolean id0);
  public void SetUseAllPoints(boolean id0)
  {
    SetUseAllPoints_7(id0);
  }

  private native boolean GetUseAllPoints_8();
  public boolean GetUseAllPoints()
  {
    return GetUseAllPoints_8();
  }

  private native void UseAllPointsOn_9();
  public void UseAllPointsOn()
  {
    UseAllPointsOn_9();
  }

  private native void UseAllPointsOff_10();
  public void UseAllPointsOff()
  {
    UseAllPointsOff_10();
  }

  private native long GetMTime_11();
  public long GetMTime()
  {
    return GetMTime_11();
  }

  public vtkExtractEdges() { super(); }

  public vtkExtractEdges(long id) { super(id); }
  public native long   VTKInit();

}
