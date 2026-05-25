// java wrapper for vtkGenericAdaptorCell object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkGenericAdaptorCell extends vtkObject
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

  private native long GetId_4();
  public long GetId()
  {
    return GetId_4();
  }

  private native int IsInDataSet_5();
  public int IsInDataSet()
  {
    return IsInDataSet_5();
  }

  private native int GetType_6();
  public int GetType()
  {
    return GetType_6();
  }

  private native int GetDimension_7();
  public int GetDimension()
  {
    return GetDimension_7();
  }

  private native int GetGeometryOrder_8();
  public int GetGeometryOrder()
  {
    return GetGeometryOrder_8();
  }

  private native int IsGeometryLinear_9();
  public int IsGeometryLinear()
  {
    return IsGeometryLinear_9();
  }

  private native int GetAttributeOrder_10(vtkGenericAttribute id0);
  public int GetAttributeOrder(vtkGenericAttribute id0)
  {
    return GetAttributeOrder_10(id0);
  }

  private native int GetHighestOrderAttribute_11(vtkGenericAttributeCollection id0);
  public int GetHighestOrderAttribute(vtkGenericAttributeCollection id0)
  {
    return GetHighestOrderAttribute_11(id0);
  }

  private native int IsAttributeLinear_12(vtkGenericAttribute id0);
  public int IsAttributeLinear(vtkGenericAttribute id0)
  {
    return IsAttributeLinear_12(id0);
  }

  private native int IsPrimary_13();
  public int IsPrimary()
  {
    return IsPrimary_13();
  }

  private native int GetNumberOfPoints_14();
  public int GetNumberOfPoints()
  {
    return GetNumberOfPoints_14();
  }

  private native int GetNumberOfBoundaries_15(int id0);
  public int GetNumberOfBoundaries(int id0)
  {
    return GetNumberOfBoundaries_15(id0);
  }

  private native int GetNumberOfDOFNodes_16();
  public int GetNumberOfDOFNodes()
  {
    return GetNumberOfDOFNodes_16();
  }

  private native void GetPointIterator_17(vtkGenericPointIterator id0);
  public void GetPointIterator(vtkGenericPointIterator id0)
  {
    GetPointIterator_17(id0);
  }

  private native long NewCellIterator_18();
  public vtkGenericCellIterator NewCellIterator()
  {
    long temp = NewCellIterator_18();

    if (temp == 0) return null;
    return (vtkGenericCellIterator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void GetBoundaryIterator_19(vtkGenericCellIterator id0,int id1);
  public void GetBoundaryIterator(vtkGenericCellIterator id0,int id1)
  {
    GetBoundaryIterator_19(id0,id1);
  }

  private native int CountNeighbors_20(vtkGenericAdaptorCell id0);
  public int CountNeighbors(vtkGenericAdaptorCell id0)
  {
    return CountNeighbors_20(id0);
  }

  private native void GetNeighbors_21(vtkGenericAdaptorCell id0,vtkGenericCellIterator id1);
  public void GetNeighbors(vtkGenericAdaptorCell id0,vtkGenericCellIterator id1)
  {
    GetNeighbors_21(id0,id1);
  }

  private native void EvaluateLocation_22(int id0,double id1[],double id2[]);
  public void EvaluateLocation(int id0,double id1[],double id2[])
  {
    EvaluateLocation_22(id0,id1,id2);
  }

  private native void Contour_23(vtkContourValues id0,vtkImplicitFunction id1,vtkGenericAttributeCollection id2,vtkGenericCellTessellator id3,vtkIncrementalPointLocator id4,vtkCellArray id5,vtkCellArray id6,vtkCellArray id7,vtkPointData id8,vtkCellData id9,vtkPointData id10,vtkPointData id11,vtkCellData id12);
  public void Contour(vtkContourValues id0,vtkImplicitFunction id1,vtkGenericAttributeCollection id2,vtkGenericCellTessellator id3,vtkIncrementalPointLocator id4,vtkCellArray id5,vtkCellArray id6,vtkCellArray id7,vtkPointData id8,vtkCellData id9,vtkPointData id10,vtkPointData id11,vtkCellData id12)
  {
    Contour_23(id0,id1,id2,id3,id4,id5,id6,id7,id8,id9,id10,id11,id12);
  }

  private native void Clip_24(double id0,vtkImplicitFunction id1,vtkGenericAttributeCollection id2,vtkGenericCellTessellator id3,int id4,vtkIncrementalPointLocator id5,vtkCellArray id6,vtkPointData id7,vtkCellData id8,vtkPointData id9,vtkPointData id10,vtkCellData id11);
  public void Clip(double id0,vtkImplicitFunction id1,vtkGenericAttributeCollection id2,vtkGenericCellTessellator id3,int id4,vtkIncrementalPointLocator id5,vtkCellArray id6,vtkPointData id7,vtkCellData id8,vtkPointData id9,vtkPointData id10,vtkCellData id11)
  {
    Clip_24(id0,id1,id2,id3,id4,id5,id6,id7,id8,id9,id10,id11);
  }

  private native void GetBounds_25(double id0[]);
  public void GetBounds(double id0[])
  {
    GetBounds_25(id0);
  }

  private native double GetLength2_26();
  public double GetLength2()
  {
    return GetLength2_26();
  }

  private native int GetParametricCenter_27(double id0[]);
  public int GetParametricCenter(double id0[])
  {
    return GetParametricCenter_27(id0);
  }

  private native double GetParametricDistance_28(double id0[]);
  public double GetParametricDistance(double id0[])
  {
    return GetParametricDistance_28(id0);
  }

  private native void Tessellate_29(vtkGenericAttributeCollection id0,vtkGenericCellTessellator id1,vtkPoints id2,vtkIncrementalPointLocator id3,vtkCellArray id4,vtkPointData id5,vtkPointData id6,vtkCellData id7,vtkUnsignedCharArray id8);
  public void Tessellate(vtkGenericAttributeCollection id0,vtkGenericCellTessellator id1,vtkPoints id2,vtkIncrementalPointLocator id3,vtkCellArray id4,vtkPointData id5,vtkPointData id6,vtkCellData id7,vtkUnsignedCharArray id8)
  {
    Tessellate_29(id0,id1,id2,id3,id4,id5,id6,id7,id8);
  }

  private native int IsFaceOnBoundary_30(long id0);
  public int IsFaceOnBoundary(long id0)
  {
    return IsFaceOnBoundary_30(id0);
  }

  private native int IsOnBoundary_31();
  public int IsOnBoundary()
  {
    return IsOnBoundary_31();
  }

  private native void TriangulateFace_32(vtkGenericAttributeCollection id0,vtkGenericCellTessellator id1,int id2,vtkPoints id3,vtkIncrementalPointLocator id4,vtkCellArray id5,vtkPointData id6,vtkPointData id7,vtkCellData id8);
  public void TriangulateFace(vtkGenericAttributeCollection id0,vtkGenericCellTessellator id1,int id2,vtkPoints id3,vtkIncrementalPointLocator id4,vtkCellArray id5,vtkPointData id6,vtkPointData id7,vtkCellData id8)
  {
    TriangulateFace_32(id0,id1,id2,id3,id4,id5,id6,id7,id8);
  }

  private native int GetNumberOfVerticesOnFace_33(int id0);
  public int GetNumberOfVerticesOnFace(int id0)
  {
    return GetNumberOfVerticesOnFace_33(id0);
  }

  public vtkGenericAdaptorCell() { super(); }

  public vtkGenericAdaptorCell(long id) { super(id); }

}
