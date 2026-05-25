// java wrapper for vtkExtractDataOverTime object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkExtractDataOverTime extends vtkPointSetAlgorithm
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

  private native void SetPointIndex_4(int id0);
  public void SetPointIndex(int id0)
  {
    SetPointIndex_4(id0);
  }

  private native int GetPointIndex_5();
  public int GetPointIndex()
  {
    return GetPointIndex_5();
  }

  private native int GetNumberOfTimeSteps_6();
  public int GetNumberOfTimeSteps()
  {
    return GetNumberOfTimeSteps_6();
  }

  public vtkExtractDataOverTime() { super(); }

  public vtkExtractDataOverTime(long id) { super(id); }
  public native long   VTKInit();

}
