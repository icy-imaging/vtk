// java wrapper for vtkGLTFDocumentLoader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkGLTFDocumentLoader extends vtkObject
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

  private native boolean ApplyAnimation_4(float id0,int id1,boolean id2);
  public boolean ApplyAnimation(float id0,int id1,boolean id2)
  {
    return ApplyAnimation_4(id0,id1,id2);
  }

  private native void ResetAnimation_5(int id0);
  public void ResetAnimation(int id0)
  {
    ResetAnimation_5(id0);
  }

  private native boolean LoadModelMetaDataFromFile_6(byte[] id0, int len0);
  public boolean LoadModelMetaDataFromFile(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return LoadModelMetaDataFromFile_6(bytes0, bytes0.length);
  }

  private native boolean LoadModelMetaDataFromStream_7(vtkResourceStream id0,vtkURILoader id1);
  public boolean LoadModelMetaDataFromStream(vtkResourceStream id0,vtkURILoader id1)
  {
    return LoadModelMetaDataFromStream_7(id0,id1);
  }

  private native boolean BuildModelVTKGeometry_8();
  public boolean BuildModelVTKGeometry()
  {
    return BuildModelVTKGeometry_8();
  }

  private native int GetNumberOfComponentsForType_9(int id0);
  public int GetNumberOfComponentsForType(int id0)
  {
    return GetNumberOfComponentsForType_9(id0);
  }

  private native void BuildGlobalTransforms_10();
  public void BuildGlobalTransforms()
  {
    BuildGlobalTransforms_10();
  }

  private native void PrepareData_11();
  public void PrepareData()
  {
    PrepareData_11();
  }

  private native void SetGLBStart_12(long id0);
  public void SetGLBStart(long id0)
  {
    SetGLBStart_12(id0);
  }

  private native long GetGLBStart_13();
  public long GetGLBStart()
  {
    return GetGLBStart_13();
  }

  public vtkGLTFDocumentLoader() { super(); }

  public vtkGLTFDocumentLoader(long id) { super(id); }
  public native long   VTKInit();

}
