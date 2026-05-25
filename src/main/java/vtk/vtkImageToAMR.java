// java wrapper for vtkImageToAMR object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageToAMR extends vtkOverlappingAMRAlgorithm
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

  private native void SetNumberOfLevels_4(int id0);
  public void SetNumberOfLevels(int id0)
  {
    SetNumberOfLevels_4(id0);
  }

  private native int GetNumberOfLevelsMinValue_5();
  public int GetNumberOfLevelsMinValue()
  {
    return GetNumberOfLevelsMinValue_5();
  }

  private native int GetNumberOfLevelsMaxValue_6();
  public int GetNumberOfLevelsMaxValue()
  {
    return GetNumberOfLevelsMaxValue_6();
  }

  private native int GetNumberOfLevels_7();
  public int GetNumberOfLevels()
  {
    return GetNumberOfLevels_7();
  }

  private native void SetRefinementRatio_8(int id0);
  public void SetRefinementRatio(int id0)
  {
    SetRefinementRatio_8(id0);
  }

  private native int GetRefinementRatioMinValue_9();
  public int GetRefinementRatioMinValue()
  {
    return GetRefinementRatioMinValue_9();
  }

  private native int GetRefinementRatioMaxValue_10();
  public int GetRefinementRatioMaxValue()
  {
    return GetRefinementRatioMaxValue_10();
  }

  private native int GetRefinementRatio_11();
  public int GetRefinementRatio()
  {
    return GetRefinementRatio_11();
  }

  private native void SetMaximumNumberOfBlocks_12(int id0);
  public void SetMaximumNumberOfBlocks(int id0)
  {
    SetMaximumNumberOfBlocks_12(id0);
  }

  private native int GetMaximumNumberOfBlocksMinValue_13();
  public int GetMaximumNumberOfBlocksMinValue()
  {
    return GetMaximumNumberOfBlocksMinValue_13();
  }

  private native int GetMaximumNumberOfBlocksMaxValue_14();
  public int GetMaximumNumberOfBlocksMaxValue()
  {
    return GetMaximumNumberOfBlocksMaxValue_14();
  }

  private native int GetMaximumNumberOfBlocks_15();
  public int GetMaximumNumberOfBlocks()
  {
    return GetMaximumNumberOfBlocks_15();
  }

  public vtkImageToAMR() { super(); }

  public vtkImageToAMR(long id) { super(id); }
  public native long   VTKInit();

}
