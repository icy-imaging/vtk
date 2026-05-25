// java wrapper for vtkRandomGraphSource object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkRandomGraphSource extends vtkGraphAlgorithm
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

  private native int GetNumberOfVertices_4();
  public int GetNumberOfVertices()
  {
    return GetNumberOfVertices_4();
  }

  private native void SetNumberOfVertices_5(int id0);
  public void SetNumberOfVertices(int id0)
  {
    SetNumberOfVertices_5(id0);
  }

  private native int GetNumberOfVerticesMinValue_6();
  public int GetNumberOfVerticesMinValue()
  {
    return GetNumberOfVerticesMinValue_6();
  }

  private native int GetNumberOfVerticesMaxValue_7();
  public int GetNumberOfVerticesMaxValue()
  {
    return GetNumberOfVerticesMaxValue_7();
  }

  private native int GetNumberOfEdges_8();
  public int GetNumberOfEdges()
  {
    return GetNumberOfEdges_8();
  }

  private native void SetNumberOfEdges_9(int id0);
  public void SetNumberOfEdges(int id0)
  {
    SetNumberOfEdges_9(id0);
  }

  private native int GetNumberOfEdgesMinValue_10();
  public int GetNumberOfEdgesMinValue()
  {
    return GetNumberOfEdgesMinValue_10();
  }

  private native int GetNumberOfEdgesMaxValue_11();
  public int GetNumberOfEdgesMaxValue()
  {
    return GetNumberOfEdgesMaxValue_11();
  }

  private native double GetEdgeProbability_12();
  public double GetEdgeProbability()
  {
    return GetEdgeProbability_12();
  }

  private native void SetEdgeProbability_13(double id0);
  public void SetEdgeProbability(double id0)
  {
    SetEdgeProbability_13(id0);
  }

  private native double GetEdgeProbabilityMinValue_14();
  public double GetEdgeProbabilityMinValue()
  {
    return GetEdgeProbabilityMinValue_14();
  }

  private native double GetEdgeProbabilityMaxValue_15();
  public double GetEdgeProbabilityMaxValue()
  {
    return GetEdgeProbabilityMaxValue_15();
  }

  private native void SetIncludeEdgeWeights_16(boolean id0);
  public void SetIncludeEdgeWeights(boolean id0)
  {
    SetIncludeEdgeWeights_16(id0);
  }

  private native boolean GetIncludeEdgeWeights_17();
  public boolean GetIncludeEdgeWeights()
  {
    return GetIncludeEdgeWeights_17();
  }

  private native void IncludeEdgeWeightsOn_18();
  public void IncludeEdgeWeightsOn()
  {
    IncludeEdgeWeightsOn_18();
  }

  private native void IncludeEdgeWeightsOff_19();
  public void IncludeEdgeWeightsOff()
  {
    IncludeEdgeWeightsOff_19();
  }

  private native void SetEdgeWeightArrayName_20(byte[] id0, int len0);
  public void SetEdgeWeightArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetEdgeWeightArrayName_20(bytes0, bytes0.length);
  }

  private native byte[] GetEdgeWeightArrayName_21();
  public String GetEdgeWeightArrayName()
  {
    return new String(GetEdgeWeightArrayName_21(), StandardCharsets.UTF_8);
  }

  private native void SetDirected_22(boolean id0);
  public void SetDirected(boolean id0)
  {
    SetDirected_22(id0);
  }

  private native boolean GetDirected_23();
  public boolean GetDirected()
  {
    return GetDirected_23();
  }

  private native void DirectedOn_24();
  public void DirectedOn()
  {
    DirectedOn_24();
  }

  private native void DirectedOff_25();
  public void DirectedOff()
  {
    DirectedOff_25();
  }

  private native void SetUseEdgeProbability_26(boolean id0);
  public void SetUseEdgeProbability(boolean id0)
  {
    SetUseEdgeProbability_26(id0);
  }

  private native boolean GetUseEdgeProbability_27();
  public boolean GetUseEdgeProbability()
  {
    return GetUseEdgeProbability_27();
  }

  private native void UseEdgeProbabilityOn_28();
  public void UseEdgeProbabilityOn()
  {
    UseEdgeProbabilityOn_28();
  }

  private native void UseEdgeProbabilityOff_29();
  public void UseEdgeProbabilityOff()
  {
    UseEdgeProbabilityOff_29();
  }

  private native void SetStartWithTree_30(boolean id0);
  public void SetStartWithTree(boolean id0)
  {
    SetStartWithTree_30(id0);
  }

  private native boolean GetStartWithTree_31();
  public boolean GetStartWithTree()
  {
    return GetStartWithTree_31();
  }

  private native void StartWithTreeOn_32();
  public void StartWithTreeOn()
  {
    StartWithTreeOn_32();
  }

  private native void StartWithTreeOff_33();
  public void StartWithTreeOff()
  {
    StartWithTreeOff_33();
  }

  private native void SetAllowSelfLoops_34(boolean id0);
  public void SetAllowSelfLoops(boolean id0)
  {
    SetAllowSelfLoops_34(id0);
  }

  private native boolean GetAllowSelfLoops_35();
  public boolean GetAllowSelfLoops()
  {
    return GetAllowSelfLoops_35();
  }

  private native void AllowSelfLoopsOn_36();
  public void AllowSelfLoopsOn()
  {
    AllowSelfLoopsOn_36();
  }

  private native void AllowSelfLoopsOff_37();
  public void AllowSelfLoopsOff()
  {
    AllowSelfLoopsOff_37();
  }

  private native void SetAllowParallelEdges_38(boolean id0);
  public void SetAllowParallelEdges(boolean id0)
  {
    SetAllowParallelEdges_38(id0);
  }

  private native boolean GetAllowParallelEdges_39();
  public boolean GetAllowParallelEdges()
  {
    return GetAllowParallelEdges_39();
  }

  private native void AllowParallelEdgesOn_40();
  public void AllowParallelEdgesOn()
  {
    AllowParallelEdgesOn_40();
  }

  private native void AllowParallelEdgesOff_41();
  public void AllowParallelEdgesOff()
  {
    AllowParallelEdgesOff_41();
  }

  private native void SetGeneratePedigreeIds_42(boolean id0);
  public void SetGeneratePedigreeIds(boolean id0)
  {
    SetGeneratePedigreeIds_42(id0);
  }

  private native boolean GetGeneratePedigreeIds_43();
  public boolean GetGeneratePedigreeIds()
  {
    return GetGeneratePedigreeIds_43();
  }

  private native void GeneratePedigreeIdsOn_44();
  public void GeneratePedigreeIdsOn()
  {
    GeneratePedigreeIdsOn_44();
  }

  private native void GeneratePedigreeIdsOff_45();
  public void GeneratePedigreeIdsOff()
  {
    GeneratePedigreeIdsOff_45();
  }

  private native void SetVertexPedigreeIdArrayName_46(byte[] id0, int len0);
  public void SetVertexPedigreeIdArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetVertexPedigreeIdArrayName_46(bytes0, bytes0.length);
  }

  private native byte[] GetVertexPedigreeIdArrayName_47();
  public String GetVertexPedigreeIdArrayName()
  {
    return new String(GetVertexPedigreeIdArrayName_47(), StandardCharsets.UTF_8);
  }

  private native void SetEdgePedigreeIdArrayName_48(byte[] id0, int len0);
  public void SetEdgePedigreeIdArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetEdgePedigreeIdArrayName_48(bytes0, bytes0.length);
  }

  private native byte[] GetEdgePedigreeIdArrayName_49();
  public String GetEdgePedigreeIdArrayName()
  {
    return new String(GetEdgePedigreeIdArrayName_49(), StandardCharsets.UTF_8);
  }

  private native void SetSeed_50(int id0);
  public void SetSeed(int id0)
  {
    SetSeed_50(id0);
  }

  private native int GetSeed_51();
  public int GetSeed()
  {
    return GetSeed_51();
  }

  public vtkRandomGraphSource() { super(); }

  public vtkRandomGraphSource(long id) { super(id); }
  public native long   VTKInit();

}
