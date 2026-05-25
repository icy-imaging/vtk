// java wrapper for vtkSurfaceNets3D object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSurfaceNets3D extends vtkPolyDataAlgorithm
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

  private native long GetMTime_4();
  public long GetMTime()
  {
    return GetMTime_4();
  }

  private native void SetValue_5(int id0,double id1);
  public void SetValue(int id0,double id1)
  {
    SetValue_5(id0,id1);
  }

  private native void SetLabel_6(int id0,double id1);
  public void SetLabel(int id0,double id1)
  {
    SetLabel_6(id0,id1);
  }

  private native double GetValue_7(int id0);
  public double GetValue(int id0)
  {
    return GetValue_7(id0);
  }

  private native double GetLabel_8(int id0);
  public double GetLabel(int id0)
  {
    return GetLabel_8(id0);
  }

  private native void SetNumberOfLabels_9(int id0);
  public void SetNumberOfLabels(int id0)
  {
    SetNumberOfLabels_9(id0);
  }

  private native void SetNumberOfContours_10(int id0);
  public void SetNumberOfContours(int id0)
  {
    SetNumberOfContours_10(id0);
  }

  private native long GetNumberOfLabels_11();
  public long GetNumberOfLabels()
  {
    return GetNumberOfLabels_11();
  }

  private native long GetNumberOfContours_12();
  public long GetNumberOfContours()
  {
    return GetNumberOfContours_12();
  }

  private native void GenerateLabels_13(int id0,double id1[]);
  public void GenerateLabels(int id0,double id1[])
  {
    GenerateLabels_13(id0,id1);
  }

  private native void GenerateValues_14(int id0,double id1[]);
  public void GenerateValues(int id0,double id1[])
  {
    GenerateValues_14(id0,id1);
  }

  private native void GenerateLabels_15(int id0,double id1,double id2);
  public void GenerateLabels(int id0,double id1,double id2)
  {
    GenerateLabels_15(id0,id1,id2);
  }

  private native void GenerateValues_16(int id0,double id1,double id2);
  public void GenerateValues(int id0,double id1,double id2)
  {
    GenerateValues_16(id0,id1,id2);
  }

  private native void SetBackgroundLabel_17(double id0);
  public void SetBackgroundLabel(double id0)
  {
    SetBackgroundLabel_17(id0);
  }

  private native double GetBackgroundLabel_18();
  public double GetBackgroundLabel()
  {
    return GetBackgroundLabel_18();
  }

  private native void SetArrayComponent_19(int id0);
  public void SetArrayComponent(int id0)
  {
    SetArrayComponent_19(id0);
  }

  private native int GetArrayComponent_20();
  public int GetArrayComponent()
  {
    return GetArrayComponent_20();
  }

  private native void SetOutputMeshType_21(int id0);
  public void SetOutputMeshType(int id0)
  {
    SetOutputMeshType_21(id0);
  }

  private native int GetOutputMeshTypeMinValue_22();
  public int GetOutputMeshTypeMinValue()
  {
    return GetOutputMeshTypeMinValue_22();
  }

  private native int GetOutputMeshTypeMaxValue_23();
  public int GetOutputMeshTypeMaxValue()
  {
    return GetOutputMeshTypeMaxValue_23();
  }

  private native int GetOutputMeshType_24();
  public int GetOutputMeshType()
  {
    return GetOutputMeshType_24();
  }

  private native void SetOutputMeshTypeToDefault_25();
  public void SetOutputMeshTypeToDefault()
  {
    SetOutputMeshTypeToDefault_25();
  }

  private native void SetOutputMeshTypeToTriangles_26();
  public void SetOutputMeshTypeToTriangles()
  {
    SetOutputMeshTypeToTriangles_26();
  }

  private native void SetOutputMeshTypeToQuads_27();
  public void SetOutputMeshTypeToQuads()
  {
    SetOutputMeshTypeToQuads_27();
  }

  private native void SetSmoothing_28(boolean id0);
  public void SetSmoothing(boolean id0)
  {
    SetSmoothing_28(id0);
  }

  private native boolean GetSmoothing_29();
  public boolean GetSmoothing()
  {
    return GetSmoothing_29();
  }

  private native void SmoothingOn_30();
  public void SmoothingOn()
  {
    SmoothingOn_30();
  }

  private native void SmoothingOff_31();
  public void SmoothingOff()
  {
    SmoothingOff_31();
  }

  private native void SetNumberOfIterations_32(int id0);
  public void SetNumberOfIterations(int id0)
  {
    SetNumberOfIterations_32(id0);
  }

  private native int GetNumberOfIterations_33();
  public int GetNumberOfIterations()
  {
    return GetNumberOfIterations_33();
  }

  private native void SetRelaxationFactor_34(double id0);
  public void SetRelaxationFactor(double id0)
  {
    SetRelaxationFactor_34(id0);
  }

  private native double GetRelaxationFactor_35();
  public double GetRelaxationFactor()
  {
    return GetRelaxationFactor_35();
  }

  private native void SetConstraintDistance_36(double id0);
  public void SetConstraintDistance(double id0)
  {
    SetConstraintDistance_36(id0);
  }

  private native double GetConstraintDistance_37();
  public double GetConstraintDistance()
  {
    return GetConstraintDistance_37();
  }

  private native void SetConstraintBox_38(double id0,double id1,double id2);
  public void SetConstraintBox(double id0,double id1,double id2)
  {
    SetConstraintBox_38(id0,id1,id2);
  }

  private native void SetConstraintBox_39(double id0[]);
  public void SetConstraintBox(double id0[])
  {
    SetConstraintBox_39(id0);
  }

  private native double[] GetConstraintBox_40();
  public double[] GetConstraintBox()
  {
    return GetConstraintBox_40();
  }

  private native void GetConstraintBox_41(double id0[]);
  public void GetConstraintBox(double id0[])
  {
    GetConstraintBox_41(id0);
  }

  private native void SetConstraintStrategyToConstraintDistance_42();
  public void SetConstraintStrategyToConstraintDistance()
  {
    SetConstraintStrategyToConstraintDistance_42();
  }

  private native void SetConstraintStrategyToConstraintBox_43();
  public void SetConstraintStrategyToConstraintBox()
  {
    SetConstraintStrategyToConstraintBox_43();
  }

  private native int GetConstraintStrategy_44();
  public int GetConstraintStrategy()
  {
    return GetConstraintStrategy_44();
  }

  private native void SetAutomaticSmoothingConstraints_45(boolean id0);
  public void SetAutomaticSmoothingConstraints(boolean id0)
  {
    SetAutomaticSmoothingConstraints_45(id0);
  }

  private native boolean GetAutomaticSmoothingConstraints_46();
  public boolean GetAutomaticSmoothingConstraints()
  {
    return GetAutomaticSmoothingConstraints_46();
  }

  private native void AutomaticSmoothingConstraintsOn_47();
  public void AutomaticSmoothingConstraintsOn()
  {
    AutomaticSmoothingConstraintsOn_47();
  }

  private native void AutomaticSmoothingConstraintsOff_48();
  public void AutomaticSmoothingConstraintsOff()
  {
    AutomaticSmoothingConstraintsOff_48();
  }

  private native void SetConstraintScale_49(double id0);
  public void SetConstraintScale(double id0)
  {
    SetConstraintScale_49(id0);
  }

  private native double GetConstraintScaleMinValue_50();
  public double GetConstraintScaleMinValue()
  {
    return GetConstraintScaleMinValue_50();
  }

  private native double GetConstraintScaleMaxValue_51();
  public double GetConstraintScaleMaxValue()
  {
    return GetConstraintScaleMaxValue_51();
  }

  private native double GetConstraintScale_52();
  public double GetConstraintScale()
  {
    return GetConstraintScale_52();
  }

  private native void SetOptimizedSmoothingStencils_53(boolean id0);
  public void SetOptimizedSmoothingStencils(boolean id0)
  {
    SetOptimizedSmoothingStencils_53(id0);
  }

  private native boolean GetOptimizedSmoothingStencils_54();
  public boolean GetOptimizedSmoothingStencils()
  {
    return GetOptimizedSmoothingStencils_54();
  }

  private native void OptimizedSmoothingStencilsOn_55();
  public void OptimizedSmoothingStencilsOn()
  {
    OptimizedSmoothingStencilsOn_55();
  }

  private native void OptimizedSmoothingStencilsOff_56();
  public void OptimizedSmoothingStencilsOff()
  {
    OptimizedSmoothingStencilsOff_56();
  }

  private native long GetSmoother_57();
  public vtkConstrainedSmoothingFilter GetSmoother()
  {
    long temp = GetSmoother_57();

    if (temp == 0) return null;
    return (vtkConstrainedSmoothingFilter)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetOutputStyle_58(int id0);
  public void SetOutputStyle(int id0)
  {
    SetOutputStyle_58(id0);
  }

  private native int GetOutputStyleMinValue_59();
  public int GetOutputStyleMinValue()
  {
    return GetOutputStyleMinValue_59();
  }

  private native int GetOutputStyleMaxValue_60();
  public int GetOutputStyleMaxValue()
  {
    return GetOutputStyleMaxValue_60();
  }

  private native int GetOutputStyle_61();
  public int GetOutputStyle()
  {
    return GetOutputStyle_61();
  }

  private native void SetOutputStyleToDefault_62();
  public void SetOutputStyleToDefault()
  {
    SetOutputStyleToDefault_62();
  }

  private native void SetOutputStyleToBoundary_63();
  public void SetOutputStyleToBoundary()
  {
    SetOutputStyleToBoundary_63();
  }

  private native void SetOutputStyleToSelected_64();
  public void SetOutputStyleToSelected()
  {
    SetOutputStyleToSelected_64();
  }

  private native void InitializeSelectedLabelsList_65();
  public void InitializeSelectedLabelsList()
  {
    InitializeSelectedLabelsList_65();
  }

  private native void AddSelectedLabel_66(double id0);
  public void AddSelectedLabel(double id0)
  {
    AddSelectedLabel_66(id0);
  }

  private native void DeleteSelectedLabel_67(double id0);
  public void DeleteSelectedLabel(double id0)
  {
    DeleteSelectedLabel_67(id0);
  }

  private native long GetNumberOfSelectedLabels_68();
  public long GetNumberOfSelectedLabels()
  {
    return GetNumberOfSelectedLabels_68();
  }

  private native double GetSelectedLabel_69(long id0);
  public double GetSelectedLabel(long id0)
  {
    return GetSelectedLabel_69(id0);
  }

  private native void SetTriangulationStrategy_70(int id0);
  public void SetTriangulationStrategy(int id0)
  {
    SetTriangulationStrategy_70(id0);
  }

  private native int GetTriangulationStrategyMinValue_71();
  public int GetTriangulationStrategyMinValue()
  {
    return GetTriangulationStrategyMinValue_71();
  }

  private native int GetTriangulationStrategyMaxValue_72();
  public int GetTriangulationStrategyMaxValue()
  {
    return GetTriangulationStrategyMaxValue_72();
  }

  private native int GetTriangulationStrategy_73();
  public int GetTriangulationStrategy()
  {
    return GetTriangulationStrategy_73();
  }

  private native void SetTriangulationStrategyToGreedy_74();
  public void SetTriangulationStrategyToGreedy()
  {
    SetTriangulationStrategyToGreedy_74();
  }

  private native void SetTriangulationStrategyToMinEdge_75();
  public void SetTriangulationStrategyToMinEdge()
  {
    SetTriangulationStrategyToMinEdge_75();
  }

  private native void SetTriangulationStrategyToMinArea_76();
  public void SetTriangulationStrategyToMinArea()
  {
    SetTriangulationStrategyToMinArea_76();
  }

  private native void SetDataCaching_77(boolean id0);
  public void SetDataCaching(boolean id0)
  {
    SetDataCaching_77(id0);
  }

  private native boolean GetDataCaching_78();
  public boolean GetDataCaching()
  {
    return GetDataCaching_78();
  }

  private native void DataCachingOn_79();
  public void DataCachingOn()
  {
    DataCachingOn_79();
  }

  private native void DataCachingOff_80();
  public void DataCachingOff()
  {
    DataCachingOff_80();
  }

  public vtkSurfaceNets3D() { super(); }

  public vtkSurfaceNets3D(long id) { super(id); }
  public native long   VTKInit();

}
