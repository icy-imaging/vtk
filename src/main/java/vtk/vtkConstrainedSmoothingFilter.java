// java wrapper for vtkConstrainedSmoothingFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkConstrainedSmoothingFilter extends vtkPointSetAlgorithm
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

  private native void SetConvergence_4(double id0);
  public void SetConvergence(double id0)
  {
    SetConvergence_4(id0);
  }

  private native double GetConvergenceMinValue_5();
  public double GetConvergenceMinValue()
  {
    return GetConvergenceMinValue_5();
  }

  private native double GetConvergenceMaxValue_6();
  public double GetConvergenceMaxValue()
  {
    return GetConvergenceMaxValue_6();
  }

  private native double GetConvergence_7();
  public double GetConvergence()
  {
    return GetConvergence_7();
  }

  private native void SetNumberOfIterations_8(int id0);
  public void SetNumberOfIterations(int id0)
  {
    SetNumberOfIterations_8(id0);
  }

  private native int GetNumberOfIterationsMinValue_9();
  public int GetNumberOfIterationsMinValue()
  {
    return GetNumberOfIterationsMinValue_9();
  }

  private native int GetNumberOfIterationsMaxValue_10();
  public int GetNumberOfIterationsMaxValue()
  {
    return GetNumberOfIterationsMaxValue_10();
  }

  private native int GetNumberOfIterations_11();
  public int GetNumberOfIterations()
  {
    return GetNumberOfIterations_11();
  }

  private native void SetRelaxationFactor_12(double id0);
  public void SetRelaxationFactor(double id0)
  {
    SetRelaxationFactor_12(id0);
  }

  private native double GetRelaxationFactor_13();
  public double GetRelaxationFactor()
  {
    return GetRelaxationFactor_13();
  }

  private native void SetConstraintStrategy_14(int id0);
  public void SetConstraintStrategy(int id0)
  {
    SetConstraintStrategy_14(id0);
  }

  private native int GetConstraintStrategyMinValue_15();
  public int GetConstraintStrategyMinValue()
  {
    return GetConstraintStrategyMinValue_15();
  }

  private native int GetConstraintStrategyMaxValue_16();
  public int GetConstraintStrategyMaxValue()
  {
    return GetConstraintStrategyMaxValue_16();
  }

  private native int GetConstraintStrategy_17();
  public int GetConstraintStrategy()
  {
    return GetConstraintStrategy_17();
  }

  private native void SetConstraintStrategyToDefault_18();
  public void SetConstraintStrategyToDefault()
  {
    SetConstraintStrategyToDefault_18();
  }

  private native void SetConstraintStrategyToConstraintDistance_19();
  public void SetConstraintStrategyToConstraintDistance()
  {
    SetConstraintStrategyToConstraintDistance_19();
  }

  private native void SetConstraintStrategyToConstraintBox_20();
  public void SetConstraintStrategyToConstraintBox()
  {
    SetConstraintStrategyToConstraintBox_20();
  }

  private native void SetConstraintStrategyToConstraintArray_21();
  public void SetConstraintStrategyToConstraintArray()
  {
    SetConstraintStrategyToConstraintArray_21();
  }

  private native void SetConstraintDistance_22(double id0);
  public void SetConstraintDistance(double id0)
  {
    SetConstraintDistance_22(id0);
  }

  private native double GetConstraintDistanceMinValue_23();
  public double GetConstraintDistanceMinValue()
  {
    return GetConstraintDistanceMinValue_23();
  }

  private native double GetConstraintDistanceMaxValue_24();
  public double GetConstraintDistanceMaxValue()
  {
    return GetConstraintDistanceMaxValue_24();
  }

  private native double GetConstraintDistance_25();
  public double GetConstraintDistance()
  {
    return GetConstraintDistance_25();
  }

  private native void SetConstraintBox_26(double id0,double id1,double id2);
  public void SetConstraintBox(double id0,double id1,double id2)
  {
    SetConstraintBox_26(id0,id1,id2);
  }

  private native void SetConstraintBox_27(double id0[]);
  public void SetConstraintBox(double id0[])
  {
    SetConstraintBox_27(id0);
  }

  private native double[] GetConstraintBox_28();
  public double[] GetConstraintBox()
  {
    return GetConstraintBox_28();
  }

  private native void SetSmoothingStencils_29(vtkCellArray id0);
  public void SetSmoothingStencils(vtkCellArray id0)
  {
    SetSmoothingStencils_29(id0);
  }

  private native long GetSmoothingStencils_30();
  public vtkCellArray GetSmoothingStencils()
  {
    long temp = GetSmoothingStencils_30();

    if (temp == 0) return null;
    return (vtkCellArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetGenerateErrorScalars_31(boolean id0);
  public void SetGenerateErrorScalars(boolean id0)
  {
    SetGenerateErrorScalars_31(id0);
  }

  private native boolean GetGenerateErrorScalars_32();
  public boolean GetGenerateErrorScalars()
  {
    return GetGenerateErrorScalars_32();
  }

  private native void GenerateErrorScalarsOn_33();
  public void GenerateErrorScalarsOn()
  {
    GenerateErrorScalarsOn_33();
  }

  private native void GenerateErrorScalarsOff_34();
  public void GenerateErrorScalarsOff()
  {
    GenerateErrorScalarsOff_34();
  }

  private native void SetGenerateErrorVectors_35(boolean id0);
  public void SetGenerateErrorVectors(boolean id0)
  {
    SetGenerateErrorVectors_35(id0);
  }

  private native boolean GetGenerateErrorVectors_36();
  public boolean GetGenerateErrorVectors()
  {
    return GetGenerateErrorVectors_36();
  }

  private native void GenerateErrorVectorsOn_37();
  public void GenerateErrorVectorsOn()
  {
    GenerateErrorVectorsOn_37();
  }

  private native void GenerateErrorVectorsOff_38();
  public void GenerateErrorVectorsOff()
  {
    GenerateErrorVectorsOff_38();
  }

  private native void SetOutputPointsPrecision_39(int id0);
  public void SetOutputPointsPrecision(int id0)
  {
    SetOutputPointsPrecision_39(id0);
  }

  private native int GetOutputPointsPrecision_40();
  public int GetOutputPointsPrecision()
  {
    return GetOutputPointsPrecision_40();
  }

  public vtkConstrainedSmoothingFilter() { super(); }

  public vtkConstrainedSmoothingFilter(long id) { super(id); }
  public native long   VTKInit();

}
