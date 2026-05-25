// java wrapper for vtkSimpleCellTessellator object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSimpleCellTessellator extends vtkGenericCellTessellator
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

  private native long GetGenericCell_4();
  public vtkGenericAdaptorCell GetGenericCell()
  {
    long temp = GetGenericCell_4();

    if (temp == 0) return null;
    return (vtkGenericAdaptorCell)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void TessellateFace_5(vtkGenericAdaptorCell id0,vtkGenericAttributeCollection id1,long id2,vtkDoubleArray id3,vtkCellArray id4,vtkPointData id5);
  public void TessellateFace(vtkGenericAdaptorCell id0,vtkGenericAttributeCollection id1,long id2,vtkDoubleArray id3,vtkCellArray id4,vtkPointData id5)
  {
    TessellateFace_5(id0,id1,id2,id3,id4,id5);
  }

  private native void Tessellate_6(vtkGenericAdaptorCell id0,vtkGenericAttributeCollection id1,vtkDoubleArray id2,vtkCellArray id3,vtkPointData id4);
  public void Tessellate(vtkGenericAdaptorCell id0,vtkGenericAttributeCollection id1,vtkDoubleArray id2,vtkCellArray id3,vtkPointData id4)
  {
    Tessellate_6(id0,id1,id2,id3,id4);
  }

  private native void Triangulate_7(vtkGenericAdaptorCell id0,vtkGenericAttributeCollection id1,vtkDoubleArray id2,vtkCellArray id3,vtkPointData id4);
  public void Triangulate(vtkGenericAdaptorCell id0,vtkGenericAttributeCollection id1,vtkDoubleArray id2,vtkCellArray id3,vtkPointData id4)
  {
    Triangulate_7(id0,id1,id2,id3,id4);
  }

  private native void Reset_8();
  public void Reset()
  {
    Reset_8();
  }

  private native void Initialize_9(vtkGenericDataSet id0);
  public void Initialize(vtkGenericDataSet id0)
  {
    Initialize_9(id0);
  }

  private native int GetFixedSubdivisions_10();
  public int GetFixedSubdivisions()
  {
    return GetFixedSubdivisions_10();
  }

  private native int GetMaxSubdivisionLevel_11();
  public int GetMaxSubdivisionLevel()
  {
    return GetMaxSubdivisionLevel_11();
  }

  private native int GetMaxAdaptiveSubdivisions_12();
  public int GetMaxAdaptiveSubdivisions()
  {
    return GetMaxAdaptiveSubdivisions_12();
  }

  private native void SetFixedSubdivisions_13(int id0);
  public void SetFixedSubdivisions(int id0)
  {
    SetFixedSubdivisions_13(id0);
  }

  private native void SetMaxSubdivisionLevel_14(int id0);
  public void SetMaxSubdivisionLevel(int id0)
  {
    SetMaxSubdivisionLevel_14(id0);
  }

  private native void SetSubdivisionLevels_15(int id0,int id1);
  public void SetSubdivisionLevels(int id0,int id1)
  {
    SetSubdivisionLevels_15(id0,id1);
  }

  public vtkSimpleCellTessellator() { super(); }

  public vtkSimpleCellTessellator(long id) { super(id); }
  public native long   VTKInit();

}
