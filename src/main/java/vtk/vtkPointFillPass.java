// java wrapper for vtkPointFillPass object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPointFillPass extends vtkDepthImageProcessingPass
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

  private native void ReleaseGraphicsResources_4(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_4(id0);
  }

  private native void SetCandidatePointRatio_5(float id0);
  public void SetCandidatePointRatio(float id0)
  {
    SetCandidatePointRatio_5(id0);
  }

  private native float GetCandidatePointRatio_6();
  public float GetCandidatePointRatio()
  {
    return GetCandidatePointRatio_6();
  }

  private native void SetMinimumCandidateAngle_7(float id0);
  public void SetMinimumCandidateAngle(float id0)
  {
    SetMinimumCandidateAngle_7(id0);
  }

  private native float GetMinimumCandidateAngle_8();
  public float GetMinimumCandidateAngle()
  {
    return GetMinimumCandidateAngle_8();
  }

  public vtkPointFillPass() { super(); }

  public vtkPointFillPass(long id) { super(id); }
  public native long   VTKInit();

}
