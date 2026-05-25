// java wrapper for vtkUncertaintyTubeFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkUncertaintyTubeFilter extends vtkPolyDataAlgorithm
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

  private native void SetNumberOfSides_4(int id0);
  public void SetNumberOfSides(int id0)
  {
    SetNumberOfSides_4(id0);
  }

  private native int GetNumberOfSidesMinValue_5();
  public int GetNumberOfSidesMinValue()
  {
    return GetNumberOfSidesMinValue_5();
  }

  private native int GetNumberOfSidesMaxValue_6();
  public int GetNumberOfSidesMaxValue()
  {
    return GetNumberOfSidesMaxValue_6();
  }

  private native int GetNumberOfSides_7();
  public int GetNumberOfSides()
  {
    return GetNumberOfSides_7();
  }

  public vtkUncertaintyTubeFilter() { super(); }

  public vtkUncertaintyTubeFilter(long id) { super(id); }
  public native long   VTKInit();

}
