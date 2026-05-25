// java wrapper for vtkStructuredAMRGridConnectivity object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkStructuredAMRGridConnectivity extends vtkAbstractGridConnectivity
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

  private native void Initialize_4(int id0,int id1,int id2);
  public void Initialize(int id0,int id1,int id2)
  {
    Initialize_4(id0,id1,id2);
  }

  private native void ComputeNeighbors_5();
  public void ComputeNeighbors()
  {
    ComputeNeighbors_5();
  }

  private native void CreateGhostLayers_6(int id0);
  public void CreateGhostLayers(int id0)
  {
    CreateGhostLayers_6(id0);
  }

  private native void RegisterGrid_7(int id0,int id1,int id2,int id3[],vtkUnsignedCharArray id4,vtkUnsignedCharArray id5,vtkPointData id6,vtkCellData id7,vtkPoints id8);
  public void RegisterGrid(int id0,int id1,int id2,int id3[],vtkUnsignedCharArray id4,vtkUnsignedCharArray id5,vtkPointData id6,vtkCellData id7,vtkPoints id8)
  {
    RegisterGrid_7(id0,id1,id2,id3,id4,id5,id6,id7,id8);
  }

  private native void RegisterGrid_8(int id0,int id1,int id2[],vtkUnsignedCharArray id3,vtkUnsignedCharArray id4,vtkPointData id5,vtkCellData id6,vtkPoints id7);
  public void RegisterGrid(int id0,int id1,int id2[],vtkUnsignedCharArray id3,vtkUnsignedCharArray id4,vtkPointData id5,vtkCellData id6,vtkPoints id7)
  {
    RegisterGrid_8(id0,id1,id2,id3,id4,id5,id6,id7);
  }

  private native void SetBalancedRefinement_9(boolean id0);
  public void SetBalancedRefinement(boolean id0)
  {
    SetBalancedRefinement_9(id0);
  }

  private native boolean GetBalancedRefinement_10();
  public boolean GetBalancedRefinement()
  {
    return GetBalancedRefinement_10();
  }

  private native void SetNodeCentered_11(boolean id0);
  public void SetNodeCentered(boolean id0)
  {
    SetNodeCentered_11(id0);
  }

  private native boolean GetNodeCentered_12();
  public boolean GetNodeCentered()
  {
    return GetNodeCentered_12();
  }

  private native void SetCellCentered_13(boolean id0);
  public void SetCellCentered(boolean id0)
  {
    SetCellCentered_13(id0);
  }

  private native boolean GetCellCentered_14();
  public boolean GetCellCentered()
  {
    return GetCellCentered_14();
  }

  private native int GetNumberOfNeighbors_15(int id0);
  public int GetNumberOfNeighbors(int id0)
  {
    return GetNumberOfNeighbors_15(id0);
  }

  private native void GetGhostedExtent_16(int id0,int id1[]);
  public void GetGhostedExtent(int id0,int id1[])
  {
    GetGhostedExtent_16(id0,id1);
  }

  public vtkStructuredAMRGridConnectivity() { super(); }

  public vtkStructuredAMRGridConnectivity(long id) { super(id); }
  public native long   VTKInit();

}
