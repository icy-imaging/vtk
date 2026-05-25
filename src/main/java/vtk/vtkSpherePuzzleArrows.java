// java wrapper for vtkSpherePuzzleArrows object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSpherePuzzleArrows extends vtkPolyDataAlgorithm
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

  private native int[] GetPermutation_4();
  public int[] GetPermutation()
  {
    return GetPermutation_4();
  }

  private native void SetPermutationComponent_5(int id0,int id1);
  public void SetPermutationComponent(int id0,int id1)
  {
    SetPermutationComponent_5(id0,id1);
  }

  private native void SetPermutation_6(vtkSpherePuzzle id0);
  public void SetPermutation(vtkSpherePuzzle id0)
  {
    SetPermutation_6(id0);
  }

  public vtkSpherePuzzleArrows() { super(); }

  public vtkSpherePuzzleArrows(long id) { super(id); }
  public native long   VTKInit();

}
