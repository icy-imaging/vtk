// java wrapper for vtkStreamingTessellator object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkStreamingTessellator extends vtkObject
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

  private native void SetSubdivisionAlgorithm_4(vtkEdgeSubdivisionCriterion id0);
  public void SetSubdivisionAlgorithm(vtkEdgeSubdivisionCriterion id0)
  {
    SetSubdivisionAlgorithm_4(id0);
  }

  private native long GetSubdivisionAlgorithm_5();
  public vtkEdgeSubdivisionCriterion GetSubdivisionAlgorithm()
  {
    long temp = GetSubdivisionAlgorithm_5();

    if (temp == 0) return null;
    return (vtkEdgeSubdivisionCriterion)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetEmbeddingDimension_6(int id0,int id1);
  public void SetEmbeddingDimension(int id0,int id1)
  {
    SetEmbeddingDimension_6(id0,id1);
  }

  private native int GetEmbeddingDimension_7(int id0);
  public int GetEmbeddingDimension(int id0)
  {
    return GetEmbeddingDimension_7(id0);
  }

  private native void SetFieldSize_8(int id0,int id1);
  public void SetFieldSize(int id0,int id1)
  {
    SetFieldSize_8(id0,id1);
  }

  private native int GetFieldSize_9(int id0);
  public int GetFieldSize(int id0)
  {
    return GetFieldSize_9(id0);
  }

  private native void SetMaximumNumberOfSubdivisions_10(int id0);
  public void SetMaximumNumberOfSubdivisions(int id0)
  {
    SetMaximumNumberOfSubdivisions_10(id0);
  }

  private native int GetMaximumNumberOfSubdivisions_11();
  public int GetMaximumNumberOfSubdivisions()
  {
    return GetMaximumNumberOfSubdivisions_11();
  }

  private native void ResetCounts_12();
  public void ResetCounts()
  {
    ResetCounts_12();
  }

  private native long GetCaseCount_13(int id0);
  public long GetCaseCount(int id0)
  {
    return GetCaseCount_13(id0);
  }

  private native long GetSubcaseCount_14(int id0,int id1);
  public long GetSubcaseCount(int id0,int id1)
  {
    return GetSubcaseCount_14(id0,id1);
  }

  public vtkStreamingTessellator() { super(); }

  public vtkStreamingTessellator(long id) { super(id); }
  public native long   VTKInit();

}
