// java wrapper for vtkPerturbCoincidentVertices object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPerturbCoincidentVertices extends vtkGraphAlgorithm
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

  private native void SetPerturbFactor_4(double id0);
  public void SetPerturbFactor(double id0)
  {
    SetPerturbFactor_4(id0);
  }

  private native double GetPerturbFactor_5();
  public double GetPerturbFactor()
  {
    return GetPerturbFactor_5();
  }

  public vtkPerturbCoincidentVertices() { super(); }

  public vtkPerturbCoincidentVertices(long id) { super(id); }
  public native long   VTKInit();

}
