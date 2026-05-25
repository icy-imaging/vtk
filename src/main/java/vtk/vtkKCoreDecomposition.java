// java wrapper for vtkKCoreDecomposition object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkKCoreDecomposition extends vtkGraphAlgorithm
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

  private native void SetOutputArrayName_4(byte[] id0, int len0);
  public void SetOutputArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetOutputArrayName_4(bytes0, bytes0.length);
  }

  private native void SetUseInDegreeNeighbors_5(boolean id0);
  public void SetUseInDegreeNeighbors(boolean id0)
  {
    SetUseInDegreeNeighbors_5(id0);
  }

  private native boolean GetUseInDegreeNeighbors_6();
  public boolean GetUseInDegreeNeighbors()
  {
    return GetUseInDegreeNeighbors_6();
  }

  private native void UseInDegreeNeighborsOn_7();
  public void UseInDegreeNeighborsOn()
  {
    UseInDegreeNeighborsOn_7();
  }

  private native void UseInDegreeNeighborsOff_8();
  public void UseInDegreeNeighborsOff()
  {
    UseInDegreeNeighborsOff_8();
  }

  private native void SetUseOutDegreeNeighbors_9(boolean id0);
  public void SetUseOutDegreeNeighbors(boolean id0)
  {
    SetUseOutDegreeNeighbors_9(id0);
  }

  private native boolean GetUseOutDegreeNeighbors_10();
  public boolean GetUseOutDegreeNeighbors()
  {
    return GetUseOutDegreeNeighbors_10();
  }

  private native void UseOutDegreeNeighborsOn_11();
  public void UseOutDegreeNeighborsOn()
  {
    UseOutDegreeNeighborsOn_11();
  }

  private native void UseOutDegreeNeighborsOff_12();
  public void UseOutDegreeNeighborsOff()
  {
    UseOutDegreeNeighborsOff_12();
  }

  private native void SetCheckInputGraph_13(boolean id0);
  public void SetCheckInputGraph(boolean id0)
  {
    SetCheckInputGraph_13(id0);
  }

  private native boolean GetCheckInputGraph_14();
  public boolean GetCheckInputGraph()
  {
    return GetCheckInputGraph_14();
  }

  private native void CheckInputGraphOn_15();
  public void CheckInputGraphOn()
  {
    CheckInputGraphOn_15();
  }

  private native void CheckInputGraphOff_16();
  public void CheckInputGraphOff()
  {
    CheckInputGraphOff_16();
  }

  public vtkKCoreDecomposition() { super(); }

  public vtkKCoreDecomposition(long id) { super(id); }
  public native long   VTKInit();

}
