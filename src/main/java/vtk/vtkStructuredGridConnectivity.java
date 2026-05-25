// java wrapper for vtkStructuredGridConnectivity object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkStructuredGridConnectivity extends vtkAbstractGridConnectivity
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

  private native void SetWholeExtent_4(int id0,int id1,int id2,int id3,int id4,int id5);
  public void SetWholeExtent(int id0,int id1,int id2,int id3,int id4,int id5)
  {
    SetWholeExtent_4(id0,id1,id2,id3,id4,id5);
  }

  private native void SetWholeExtent_5(int id0[]);
  public void SetWholeExtent(int id0[])
  {
    SetWholeExtent_5(id0);
  }

  private native int[] GetWholeExtent_6();
  public int[] GetWholeExtent()
  {
    return GetWholeExtent_6();
  }

  private native int GetDataDimension_7();
  public int GetDataDimension()
  {
    return GetDataDimension_7();
  }

  private native void SetNumberOfGrids_8(int id0);
  public void SetNumberOfGrids(int id0)
  {
    SetNumberOfGrids_8(id0);
  }

  private native void RegisterGrid_9(int id0,int id1[],vtkUnsignedCharArray id2,vtkUnsignedCharArray id3,vtkPointData id4,vtkCellData id5,vtkPoints id6);
  public void RegisterGrid(int id0,int id1[],vtkUnsignedCharArray id2,vtkUnsignedCharArray id3,vtkPointData id4,vtkCellData id5,vtkPoints id6)
  {
    RegisterGrid_9(id0,id1,id2,id3,id4,id5,id6);
  }

  private native void GetGridExtent_10(int id0,int id1[]);
  public void GetGridExtent(int id0,int id1[])
  {
    GetGridExtent_10(id0,id1);
  }

  private native void SetGhostedGridExtent_11(int id0,int id1[]);
  public void SetGhostedGridExtent(int id0,int id1[])
  {
    SetGhostedGridExtent_11(id0,id1);
  }

  private native void GetGhostedGridExtent_12(int id0,int id1[]);
  public void GetGhostedGridExtent(int id0,int id1[])
  {
    GetGhostedGridExtent_12(id0,id1);
  }

  private native void ComputeNeighbors_13();
  public void ComputeNeighbors()
  {
    ComputeNeighbors_13();
  }

  private native int GetNumberOfNeighbors_14(int id0);
  public int GetNumberOfNeighbors(int id0)
  {
    return GetNumberOfNeighbors_14(id0);
  }

  private native void FillGhostArrays_15(int id0,vtkUnsignedCharArray id1,vtkUnsignedCharArray id2);
  public void FillGhostArrays(int id0,vtkUnsignedCharArray id1,vtkUnsignedCharArray id2)
  {
    FillGhostArrays_15(id0,id1,id2);
  }

  private native void CreateGhostLayers_16(int id0);
  public void CreateGhostLayers(int id0)
  {
    CreateGhostLayers_16(id0);
  }

  public vtkStructuredGridConnectivity() { super(); }

  public vtkStructuredGridConnectivity(long id) { super(id); }
  public native long   VTKInit();

}
