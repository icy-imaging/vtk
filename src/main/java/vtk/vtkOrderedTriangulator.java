// java wrapper for vtkOrderedTriangulator object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkOrderedTriangulator extends vtkObject
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

  private native void InitTriangulation_4(double id0,double id1,double id2,double id3,double id4,double id5,int id6);
  public void InitTriangulation(double id0,double id1,double id2,double id3,double id4,double id5,int id6)
  {
    InitTriangulation_4(id0,id1,id2,id3,id4,id5,id6);
  }

  private native void InitTriangulation_5(double id0[],int id1);
  public void InitTriangulation(double id0[],int id1)
  {
    InitTriangulation_5(id0,id1);
  }

  private native long InsertPoint_6(long id0,double id1[],double id2[],int id3);
  public long InsertPoint(long id0,double id1[],double id2[],int id3)
  {
    return InsertPoint_6(id0,id1,id2,id3);
  }

  private native long InsertPoint_7(long id0,long id1,double id2[],double id3[],int id4);
  public long InsertPoint(long id0,long id1,double id2[],double id3[],int id4)
  {
    return InsertPoint_7(id0,id1,id2,id3,id4);
  }

  private native long InsertPoint_8(long id0,long id1,long id2,double id3[],double id4[],int id5);
  public long InsertPoint(long id0,long id1,long id2,double id3[],double id4[],int id5)
  {
    return InsertPoint_8(id0,id1,id2,id3,id4,id5);
  }

  private native void Triangulate_9();
  public void Triangulate()
  {
    Triangulate_9();
  }

  private native void TemplateTriangulate_10(int id0,int id1,int id2);
  public void TemplateTriangulate(int id0,int id1,int id2)
  {
    TemplateTriangulate_10(id0,id1,id2);
  }

  private native void UpdatePointType_11(long id0,int id1);
  public void UpdatePointType(long id0,int id1)
  {
    UpdatePointType_11(id0,id1);
  }

  private native long GetPointId_12(long id0);
  public long GetPointId(long id0)
  {
    return GetPointId_12(id0);
  }

  private native int GetNumberOfPoints_13();
  public int GetNumberOfPoints()
  {
    return GetNumberOfPoints_13();
  }

  private native void SetUseTemplates_14(int id0);
  public void SetUseTemplates(int id0)
  {
    SetUseTemplates_14(id0);
  }

  private native int GetUseTemplates_15();
  public int GetUseTemplates()
  {
    return GetUseTemplates_15();
  }

  private native void UseTemplatesOn_16();
  public void UseTemplatesOn()
  {
    UseTemplatesOn_16();
  }

  private native void UseTemplatesOff_17();
  public void UseTemplatesOff()
  {
    UseTemplatesOff_17();
  }

  private native void SetPreSorted_18(int id0);
  public void SetPreSorted(int id0)
  {
    SetPreSorted_18(id0);
  }

  private native int GetPreSorted_19();
  public int GetPreSorted()
  {
    return GetPreSorted_19();
  }

  private native void PreSortedOn_20();
  public void PreSortedOn()
  {
    PreSortedOn_20();
  }

  private native void PreSortedOff_21();
  public void PreSortedOff()
  {
    PreSortedOff_21();
  }

  private native void SetUseTwoSortIds_22(int id0);
  public void SetUseTwoSortIds(int id0)
  {
    SetUseTwoSortIds_22(id0);
  }

  private native int GetUseTwoSortIds_23();
  public int GetUseTwoSortIds()
  {
    return GetUseTwoSortIds_23();
  }

  private native void UseTwoSortIdsOn_24();
  public void UseTwoSortIdsOn()
  {
    UseTwoSortIdsOn_24();
  }

  private native void UseTwoSortIdsOff_25();
  public void UseTwoSortIdsOff()
  {
    UseTwoSortIdsOff_25();
  }

  private native long GetTetras_26(int id0,vtkUnstructuredGrid id1);
  public long GetTetras(int id0,vtkUnstructuredGrid id1)
  {
    return GetTetras_26(id0,id1);
  }

  private native long AddTetras_27(int id0,vtkUnstructuredGrid id1);
  public long AddTetras(int id0,vtkUnstructuredGrid id1)
  {
    return AddTetras_27(id0,id1);
  }

  private native long AddTetras_28(int id0,vtkCellArray id1);
  public long AddTetras(int id0,vtkCellArray id1)
  {
    return AddTetras_28(id0,id1);
  }

  private native long AddTetras_29(int id0,vtkIncrementalPointLocator id1,vtkCellArray id2,vtkPointData id3,vtkPointData id4,vtkCellData id5,long id6,vtkCellData id7);
  public long AddTetras(int id0,vtkIncrementalPointLocator id1,vtkCellArray id2,vtkPointData id3,vtkPointData id4,vtkCellData id5,long id6,vtkCellData id7)
  {
    return AddTetras_29(id0,id1,id2,id3,id4,id5,id6,id7);
  }

  private native long AddTetras_30(int id0,vtkIdList id1,vtkPoints id2);
  public long AddTetras(int id0,vtkIdList id1,vtkPoints id2)
  {
    return AddTetras_30(id0,id1,id2);
  }

  private native long AddTetras_31(int id0,vtkIdList id1);
  public long AddTetras(int id0,vtkIdList id1)
  {
    return AddTetras_31(id0,id1);
  }

  private native long AddTriangles_32(vtkCellArray id0);
  public long AddTriangles(vtkCellArray id0)
  {
    return AddTriangles_32(id0);
  }

  private native long AddTriangles_33(long id0,vtkCellArray id1);
  public long AddTriangles(long id0,vtkCellArray id1)
  {
    return AddTriangles_33(id0,id1);
  }

  private native void InitTetraTraversal_34();
  public void InitTetraTraversal()
  {
    InitTetraTraversal_34();
  }

  private native int GetNextTetra_35(int id0,vtkTetra id1,vtkDataArray id2,vtkDoubleArray id3);
  public int GetNextTetra(int id0,vtkTetra id1,vtkDataArray id2,vtkDoubleArray id3)
  {
    return GetNextTetra_35(id0,id1,id2,id3);
  }

  public vtkOrderedTriangulator() { super(); }

  public vtkOrderedTriangulator(long id) { super(id); }
  public native long   VTKInit();

}
