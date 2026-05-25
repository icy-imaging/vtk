// java wrapper for vtkRectilinearGridToTetrahedra object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkRectilinearGridToTetrahedra extends vtkUnstructuredGridAlgorithm
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

  private native void SetTetraPerCellTo5_4();
  public void SetTetraPerCellTo5()
  {
    SetTetraPerCellTo5_4();
  }

  private native void SetTetraPerCellTo6_5();
  public void SetTetraPerCellTo6()
  {
    SetTetraPerCellTo6_5();
  }

  private native void SetTetraPerCellTo12_6();
  public void SetTetraPerCellTo12()
  {
    SetTetraPerCellTo12_6();
  }

  private native void SetTetraPerCellTo5And12_7();
  public void SetTetraPerCellTo5And12()
  {
    SetTetraPerCellTo5And12_7();
  }

  private native void SetTetraPerCell_8(int id0);
  public void SetTetraPerCell(int id0)
  {
    SetTetraPerCell_8(id0);
  }

  private native int GetTetraPerCell_9();
  public int GetTetraPerCell()
  {
    return GetTetraPerCell_9();
  }

  private native void SetRememberVoxelId_10(int id0);
  public void SetRememberVoxelId(int id0)
  {
    SetRememberVoxelId_10(id0);
  }

  private native int GetRememberVoxelId_11();
  public int GetRememberVoxelId()
  {
    return GetRememberVoxelId_11();
  }

  private native void RememberVoxelIdOn_12();
  public void RememberVoxelIdOn()
  {
    RememberVoxelIdOn_12();
  }

  private native void RememberVoxelIdOff_13();
  public void RememberVoxelIdOff()
  {
    RememberVoxelIdOff_13();
  }

  private native void SetInput_14(double id0[],double id1[],double id2);
  public void SetInput(double id0[],double id1[],double id2)
  {
    SetInput_14(id0,id1,id2);
  }

  private native void SetInput_15(double id0,double id1,double id2,double id3,double id4,double id5,double id6);
  public void SetInput(double id0,double id1,double id2,double id3,double id4,double id5,double id6)
  {
    SetInput_15(id0,id1,id2,id3,id4,id5,id6);
  }

  public vtkRectilinearGridToTetrahedra() { super(); }

  public vtkRectilinearGridToTetrahedra(long id) { super(id); }
  public native long   VTKInit();

}
