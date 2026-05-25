// java wrapper for vtkImageAnisotropicDiffusion2D object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageAnisotropicDiffusion2D extends vtkImageSpatialAlgorithm
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

  private native void SetNumberOfIterations_4(int id0);
  public void SetNumberOfIterations(int id0)
  {
    SetNumberOfIterations_4(id0);
  }

  private native int GetNumberOfIterations_5();
  public int GetNumberOfIterations()
  {
    return GetNumberOfIterations_5();
  }

  private native void SetDiffusionThreshold_6(double id0);
  public void SetDiffusionThreshold(double id0)
  {
    SetDiffusionThreshold_6(id0);
  }

  private native double GetDiffusionThreshold_7();
  public double GetDiffusionThreshold()
  {
    return GetDiffusionThreshold_7();
  }

  private native void SetDiffusionFactor_8(double id0);
  public void SetDiffusionFactor(double id0)
  {
    SetDiffusionFactor_8(id0);
  }

  private native double GetDiffusionFactor_9();
  public double GetDiffusionFactor()
  {
    return GetDiffusionFactor_9();
  }

  private native void SetFaces_10(int id0);
  public void SetFaces(int id0)
  {
    SetFaces_10(id0);
  }

  private native int GetFaces_11();
  public int GetFaces()
  {
    return GetFaces_11();
  }

  private native void FacesOn_12();
  public void FacesOn()
  {
    FacesOn_12();
  }

  private native void FacesOff_13();
  public void FacesOff()
  {
    FacesOff_13();
  }

  private native void SetEdges_14(int id0);
  public void SetEdges(int id0)
  {
    SetEdges_14(id0);
  }

  private native int GetEdges_15();
  public int GetEdges()
  {
    return GetEdges_15();
  }

  private native void EdgesOn_16();
  public void EdgesOn()
  {
    EdgesOn_16();
  }

  private native void EdgesOff_17();
  public void EdgesOff()
  {
    EdgesOff_17();
  }

  private native void SetCorners_18(int id0);
  public void SetCorners(int id0)
  {
    SetCorners_18(id0);
  }

  private native int GetCorners_19();
  public int GetCorners()
  {
    return GetCorners_19();
  }

  private native void CornersOn_20();
  public void CornersOn()
  {
    CornersOn_20();
  }

  private native void CornersOff_21();
  public void CornersOff()
  {
    CornersOff_21();
  }

  private native void SetGradientMagnitudeThreshold_22(int id0);
  public void SetGradientMagnitudeThreshold(int id0)
  {
    SetGradientMagnitudeThreshold_22(id0);
  }

  private native int GetGradientMagnitudeThreshold_23();
  public int GetGradientMagnitudeThreshold()
  {
    return GetGradientMagnitudeThreshold_23();
  }

  private native void GradientMagnitudeThresholdOn_24();
  public void GradientMagnitudeThresholdOn()
  {
    GradientMagnitudeThresholdOn_24();
  }

  private native void GradientMagnitudeThresholdOff_25();
  public void GradientMagnitudeThresholdOff()
  {
    GradientMagnitudeThresholdOff_25();
  }

  public vtkImageAnisotropicDiffusion2D() { super(); }

  public vtkImageAnisotropicDiffusion2D(long id) { super(id); }
  public native long   VTKInit();

}
