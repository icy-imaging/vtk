// java wrapper for vtkChacoReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkChacoReader extends vtkUnstructuredGridAlgorithm
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

  private native void SetBaseName_4(byte[] id0, int len0);
  public void SetBaseName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetBaseName_4(bytes0, bytes0.length);
  }

  private native byte[] GetBaseName_5();
  public String GetBaseName()
  {
    return new String(GetBaseName_5(), StandardCharsets.UTF_8);
  }

  private native void SetGenerateGlobalElementIdArray_6(int id0);
  public void SetGenerateGlobalElementIdArray(int id0)
  {
    SetGenerateGlobalElementIdArray_6(id0);
  }

  private native int GetGenerateGlobalElementIdArray_7();
  public int GetGenerateGlobalElementIdArray()
  {
    return GetGenerateGlobalElementIdArray_7();
  }

  private native void GenerateGlobalElementIdArrayOn_8();
  public void GenerateGlobalElementIdArrayOn()
  {
    GenerateGlobalElementIdArrayOn_8();
  }

  private native void GenerateGlobalElementIdArrayOff_9();
  public void GenerateGlobalElementIdArrayOff()
  {
    GenerateGlobalElementIdArrayOff_9();
  }

  private native byte[] GetGlobalElementIdArrayName_10();
  public String GetGlobalElementIdArrayName()
  {
    return new String(GetGlobalElementIdArrayName_10(), StandardCharsets.UTF_8);
  }

  private native void SetGenerateGlobalNodeIdArray_11(int id0);
  public void SetGenerateGlobalNodeIdArray(int id0)
  {
    SetGenerateGlobalNodeIdArray_11(id0);
  }

  private native int GetGenerateGlobalNodeIdArray_12();
  public int GetGenerateGlobalNodeIdArray()
  {
    return GetGenerateGlobalNodeIdArray_12();
  }

  private native void GenerateGlobalNodeIdArrayOn_13();
  public void GenerateGlobalNodeIdArrayOn()
  {
    GenerateGlobalNodeIdArrayOn_13();
  }

  private native void GenerateGlobalNodeIdArrayOff_14();
  public void GenerateGlobalNodeIdArrayOff()
  {
    GenerateGlobalNodeIdArrayOff_14();
  }

  private native byte[] GetGlobalNodeIdArrayName_15();
  public String GetGlobalNodeIdArrayName()
  {
    return new String(GetGlobalNodeIdArrayName_15(), StandardCharsets.UTF_8);
  }

  private native void SetGenerateVertexWeightArrays_16(int id0);
  public void SetGenerateVertexWeightArrays(int id0)
  {
    SetGenerateVertexWeightArrays_16(id0);
  }

  private native int GetGenerateVertexWeightArrays_17();
  public int GetGenerateVertexWeightArrays()
  {
    return GetGenerateVertexWeightArrays_17();
  }

  private native void GenerateVertexWeightArraysOn_18();
  public void GenerateVertexWeightArraysOn()
  {
    GenerateVertexWeightArraysOn_18();
  }

  private native void GenerateVertexWeightArraysOff_19();
  public void GenerateVertexWeightArraysOff()
  {
    GenerateVertexWeightArraysOff_19();
  }

  private native int GetNumberOfVertexWeights_20();
  public int GetNumberOfVertexWeights()
  {
    return GetNumberOfVertexWeights_20();
  }

  private native byte[] GetVertexWeightArrayName_21(int id0);
  public String GetVertexWeightArrayName(int id0)
  {
    return new String(GetVertexWeightArrayName_21(id0), StandardCharsets.UTF_8);
  }

  private native void SetGenerateEdgeWeightArrays_22(int id0);
  public void SetGenerateEdgeWeightArrays(int id0)
  {
    SetGenerateEdgeWeightArrays_22(id0);
  }

  private native int GetGenerateEdgeWeightArrays_23();
  public int GetGenerateEdgeWeightArrays()
  {
    return GetGenerateEdgeWeightArrays_23();
  }

  private native void GenerateEdgeWeightArraysOn_24();
  public void GenerateEdgeWeightArraysOn()
  {
    GenerateEdgeWeightArraysOn_24();
  }

  private native void GenerateEdgeWeightArraysOff_25();
  public void GenerateEdgeWeightArraysOff()
  {
    GenerateEdgeWeightArraysOff_25();
  }

  private native int GetNumberOfEdgeWeights_26();
  public int GetNumberOfEdgeWeights()
  {
    return GetNumberOfEdgeWeights_26();
  }

  private native byte[] GetEdgeWeightArrayName_27(int id0);
  public String GetEdgeWeightArrayName(int id0)
  {
    return new String(GetEdgeWeightArrayName_27(id0), StandardCharsets.UTF_8);
  }

  private native int GetDimensionality_28();
  public int GetDimensionality()
  {
    return GetDimensionality_28();
  }

  private native long GetNumberOfEdges_29();
  public long GetNumberOfEdges()
  {
    return GetNumberOfEdges_29();
  }

  private native long GetNumberOfVertices_30();
  public long GetNumberOfVertices()
  {
    return GetNumberOfVertices_30();
  }

  private native int GetNumberOfCellWeightArrays_31();
  public int GetNumberOfCellWeightArrays()
  {
    return GetNumberOfCellWeightArrays_31();
  }

  private native int GetNumberOfPointWeightArrays_32();
  public int GetNumberOfPointWeightArrays()
  {
    return GetNumberOfPointWeightArrays_32();
  }

  public vtkChacoReader() { super(); }

  public vtkChacoReader(long id) { super(id); }
  public native long   VTKInit();

}
