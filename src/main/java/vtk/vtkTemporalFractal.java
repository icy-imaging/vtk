// java wrapper for vtkTemporalFractal object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTemporalFractal extends vtkAlgorithm
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

  private native void SetFractalValue_4(float id0);
  public void SetFractalValue(float id0)
  {
    SetFractalValue_4(id0);
  }

  private native float GetFractalValue_5();
  public float GetFractalValue()
  {
    return GetFractalValue_5();
  }

  private native void SetMaximumLevel_6(int id0);
  public void SetMaximumLevel(int id0)
  {
    SetMaximumLevel_6(id0);
  }

  private native int GetMaximumLevel_7();
  public int GetMaximumLevel()
  {
    return GetMaximumLevel_7();
  }

  private native void SetDimensions_8(int id0);
  public void SetDimensions(int id0)
  {
    SetDimensions_8(id0);
  }

  private native int GetDimensions_9();
  public int GetDimensions()
  {
    return GetDimensions_9();
  }

  private native void SetGhostLevels_10(int id0);
  public void SetGhostLevels(int id0)
  {
    SetGhostLevels_10(id0);
  }

  private native int GetGhostLevels_11();
  public int GetGhostLevels()
  {
    return GetGhostLevels_11();
  }

  private native void GhostLevelsOn_12();
  public void GhostLevelsOn()
  {
    GhostLevelsOn_12();
  }

  private native void GhostLevelsOff_13();
  public void GhostLevelsOff()
  {
    GhostLevelsOff_13();
  }

  private native void SetGenerateRectilinearGrids_14(int id0);
  public void SetGenerateRectilinearGrids(int id0)
  {
    SetGenerateRectilinearGrids_14(id0);
  }

  private native int GetGenerateRectilinearGrids_15();
  public int GetGenerateRectilinearGrids()
  {
    return GetGenerateRectilinearGrids_15();
  }

  private native void GenerateRectilinearGridsOn_16();
  public void GenerateRectilinearGridsOn()
  {
    GenerateRectilinearGridsOn_16();
  }

  private native void GenerateRectilinearGridsOff_17();
  public void GenerateRectilinearGridsOff()
  {
    GenerateRectilinearGridsOff_17();
  }

  private native void SetDiscreteTimeSteps_18(int id0);
  public void SetDiscreteTimeSteps(int id0)
  {
    SetDiscreteTimeSteps_18(id0);
  }

  private native int GetDiscreteTimeSteps_19();
  public int GetDiscreteTimeSteps()
  {
    return GetDiscreteTimeSteps_19();
  }

  private native void DiscreteTimeStepsOn_20();
  public void DiscreteTimeStepsOn()
  {
    DiscreteTimeStepsOn_20();
  }

  private native void DiscreteTimeStepsOff_21();
  public void DiscreteTimeStepsOff()
  {
    DiscreteTimeStepsOff_21();
  }

  private native void SetTwoDimensional_22(int id0);
  public void SetTwoDimensional(int id0)
  {
    SetTwoDimensional_22(id0);
  }

  private native int GetTwoDimensional_23();
  public int GetTwoDimensional()
  {
    return GetTwoDimensional_23();
  }

  private native void TwoDimensionalOn_24();
  public void TwoDimensionalOn()
  {
    TwoDimensionalOn_24();
  }

  private native void TwoDimensionalOff_25();
  public void TwoDimensionalOff()
  {
    TwoDimensionalOff_25();
  }

  private native void SetAsymmetric_26(int id0);
  public void SetAsymmetric(int id0)
  {
    SetAsymmetric_26(id0);
  }

  private native int GetAsymmetric_27();
  public int GetAsymmetric()
  {
    return GetAsymmetric_27();
  }

  private native void SetAdaptiveSubdivision_28(int id0);
  public void SetAdaptiveSubdivision(int id0)
  {
    SetAdaptiveSubdivision_28(id0);
  }

  private native int GetAdaptiveSubdivision_29();
  public int GetAdaptiveSubdivision()
  {
    return GetAdaptiveSubdivision_29();
  }

  private native void AdaptiveSubdivisionOn_30();
  public void AdaptiveSubdivisionOn()
  {
    AdaptiveSubdivisionOn_30();
  }

  private native void AdaptiveSubdivisionOff_31();
  public void AdaptiveSubdivisionOff()
  {
    AdaptiveSubdivisionOff_31();
  }

  public vtkTemporalFractal() { super(); }

  public vtkTemporalFractal(long id) { super(id); }
  public native long   VTKInit();

}
