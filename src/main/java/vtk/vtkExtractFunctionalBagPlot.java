// java wrapper for vtkExtractFunctionalBagPlot object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkExtractFunctionalBagPlot extends vtkTableAlgorithm
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

  private native void SetDensityForP50_4(double id0);
  public void SetDensityForP50(double id0)
  {
    SetDensityForP50_4(id0);
  }

  private native void SetDensityForPUser_5(double id0);
  public void SetDensityForPUser(double id0)
  {
    SetDensityForPUser_5(id0);
  }

  private native void SetPUser_6(int id0);
  public void SetPUser(int id0)
  {
    SetPUser_6(id0);
  }

  public vtkExtractFunctionalBagPlot() { super(); }

  public vtkExtractFunctionalBagPlot(long id) { super(id); }
  public native long   VTKInit();

}
