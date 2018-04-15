/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import com.sun.j3d.utils.geometry.Box;
import com.sun.j3d.utils.geometry.Cylinder;
import com.sun.j3d.utils.geometry.Primitive;
import com.sun.j3d.utils.geometry.Sphere;
import java.util.ArrayList;
import javax.media.j3d.Alpha;
import javax.media.j3d.Appearance;
import javax.media.j3d.BoundingSphere;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.Group;
import javax.media.j3d.Material;
import javax.media.j3d.RotationPathInterpolator;
import javax.media.j3d.Transform3D;
import javax.media.j3d.TransformGroup;
import javax.vecmath.AxisAngle4f;
import javax.vecmath.Color3f;
import javax.vecmath.Point3d;
import javax.vecmath.Quat4f;
import javax.vecmath.Vector3f;

/**
 *
 * @author fvelasco
 */
class Pendulum extends BranchGroup {
  private Transform3D transCube1;
  private Transform3D transCube2;
  private Transform3D transCube3;
  private Transform3D transCube4;
  private Transform3D transCube5;
  private Transform3D transCube6;
  private Transform3D transCube7;
  private Transform3D transCube8;
  private TransformGroup tgCube1;
  private TransformGroup tgCube2;
  private TransformGroup tgCube3;
  private TransformGroup tgCube4;
  private TransformGroup tgCube5;
  private TransformGroup tgCube6;
  private TransformGroup tgCube7;
  private TransformGroup tgCube8;
  private ArrayList<Integer> varcubo1 = new ArrayList<Integer>();
  private ArrayList<Integer> varcubo2 = new ArrayList<Integer>();
  private ArrayList<Integer> varcubo3 = new ArrayList<Integer>();
  private ArrayList<Integer> varcubo4 = new ArrayList<Integer>();
  private ArrayList<Integer> varcubo5 = new ArrayList<Integer>();
  private ArrayList<Integer> varcubo6 = new ArrayList<Integer>();
  private ArrayList<Integer> varcubo7 = new ArrayList<Integer>();
  private ArrayList<Integer> varcubo8 = new ArrayList<Integer>();
  private ArrayList<Integer> bl1 = new ArrayList<Integer>(); //Cubo1, codigo: 1
  private ArrayList<Integer> bl2 = new ArrayList<Integer>(); //Cubo2, codigo: 2
  private ArrayList<Integer> bl3 = new ArrayList<Integer>(); //Cubo3, codigo: 3
  private ArrayList<Integer> bl4 = new ArrayList<Integer>(); //Cubo4, codigo: 4
  private ArrayList<Integer> az1 = new ArrayList<Integer>(); //Cubo1, codigo: 5
  private ArrayList<Integer> az2 = new ArrayList<Integer>(); //Cubo3, codigo: 6
  private ArrayList<Integer> az3 = new ArrayList<Integer>(); //Cubo5, codigo: 7
  private ArrayList<Integer> az4 = new ArrayList<Integer>(); //Cubo7, codigo: 8
  private ArrayList<Integer> ro1 = new ArrayList<Integer>(); //Cubo1, codigo: 9
  private ArrayList<Integer> ro2 = new ArrayList<Integer>(); //Cubo2, codigo: 10
  private ArrayList<Integer> ro3 = new ArrayList<Integer>(); //Cubo5, codigo: 11
  private ArrayList<Integer> ro4 = new ArrayList<Integer>(); //Cubo6, codigo: 12
  private ArrayList<Integer> ve1 = new ArrayList<Integer>(); //Cubo2, codigo: 13
  private ArrayList<Integer> ve2 = new ArrayList<Integer>(); //Cubo4, codigo: 14
  private ArrayList<Integer> ve3 = new ArrayList<Integer>(); //Cubo6, codigo: 15
  private ArrayList<Integer> ve4 = new ArrayList<Integer>(); //Cubo8, codigo: 16
  private ArrayList<Integer> am1 = new ArrayList<Integer>(); //Cubo5, codigo: 17
  private ArrayList<Integer> am2 = new ArrayList<Integer>(); //Cubo6, codigo: 18
  private ArrayList<Integer> am3 = new ArrayList<Integer>(); //Cubo7, codigo: 19
  private ArrayList<Integer> am4 = new ArrayList<Integer>(); //Cubo8, codigo: 20
  private ArrayList<Integer> na1 = new ArrayList<Integer>(); //Cubo3, codigo: 21
  private ArrayList<Integer> na2 = new ArrayList<Integer>(); //Cubo4, codigo: 22
  private ArrayList<Integer> na3 = new ArrayList<Integer>(); //Cubo7, codigo: 23
  private ArrayList<Integer> na4 = new ArrayList<Integer>(); //Cubo8, codigo: 24
  
  
  Pendulum () {
    
    inicializarVarCubos();
    
      
    
    // Se crea el aspecto
    Appearance gold = new Appearance();
    gold.setMaterial(new Material (
        new Color3f (0.10f, 0.10f, 0.10f),   // Color ambiental
        new Color3f (0.00f, 0.00f, 0.00f),   // Color emisivo
        new Color3f (0.10f, 0.10f, 0.10f),   // Color difuso
        new Color3f (0.10f, 0.10f, 0.10f),   // Color especular
        17.0f ));                            // Brillo
    
    
    Appearance cB = new Appearance();
    cB.setMaterial(new Material (
        new Color3f (1.0f, 1.0f, 1.0f),   // Color ambiental
        new Color3f (0.00f, 0.00f, 0.00f),   // Color emisivo
        new Color3f (0.90f, 0.90f, 0.90f),   // Color difuso
        new Color3f (0.90f, 0.90f, 0.90f),   // Color especular
        17.0f ));                            // Brillo
    
    Appearance cA = new Appearance();
    cA.setMaterial(new Material (
        new Color3f (1.0f, 1.0f, 0.0f),   // Color ambiental
        new Color3f (0.00f, 0.00f, 0.00f),   // Color emisivo
        new Color3f (1.0f, 1.0f, 0.0f),   // Color difuso
        new Color3f (1.0f, 1.0f, 0.0f),   // Color especular
        17.0f ));                            // Brillo
    
    Appearance cR = new Appearance();
    cR.setMaterial(new Material (
        new Color3f (1.0f, 0.0f, 0.0f),   // Color ambiental
        new Color3f (0.00f, 0.00f, 0.00f),   // Color emisivo
        new Color3f (1.0f, 0.0f, 0.0f),   // Color difuso
        new Color3f (1.0f, 0.0f, 0.0f),   // Color especular
        17.0f ));                            // Brillo
    
    Appearance cN = new Appearance();
    cN.setMaterial(new Material (
        new Color3f (1.0f, 0.50f, 0.0f),   // Color ambiental
        new Color3f (0.00f, 0.00f, 0.00f),   // Color emisivo
        new Color3f (1.0f, 0.50f, 0.0f),   // Color difuso
        new Color3f (1.0f, 0.50f, 0.0f),   // Color especular
        17.0f ));                            // Brillo
    
    Appearance cAz = new Appearance();
    cAz.setMaterial(new Material (
        new Color3f (0.0f, 0.0f, 1.0f),   // Color ambiental
        new Color3f (0.00f, 0.00f, 0.00f),   // Color emisivo
        new Color3f (0.0f, 0.0f, 1.0f),   // Color difuso
        new Color3f (0.0f, 0.0f, 1.0f),   // Color especular
        17.0f ));                            // Brillo
    
    Appearance cV = new Appearance();
    cV.setMaterial(new Material (
        new Color3f (0.0f, 1.0f, 0.0f),   // Color ambiental
        new Color3f (0.00f, 0.00f, 0.00f),   // Color emisivo
        new Color3f (0.0f, 1.0f, 0.0f),   // Color difuso
        new Color3f (0.0f, 1.0f, 0.0f),   // Color especular
        17.0f ));                            // Brillo
    
    
    
    
    
    Box caraB1 = new Box(0.90f, 0.90f, 0.90f, cB);
    Box caraB2 = new Box(0.90f, 0.90f, 0.90f, cB);
    Box caraB3 = new Box(0.90f, 0.90f, 0.90f, cB);
    Box caraB4 = new Box(0.90f, 0.90f, 0.90f, cB);
    
    Box caraA1 = new Box(0.90f, 0.90f, 0.90f, cA);
    Box caraA2 = new Box(0.90f, 0.90f, 0.90f, cA);
    Box caraA3 = new Box(0.90f, 0.90f, 0.90f, cA);
    Box caraA4 = new Box(0.90f, 0.90f, 0.90f, cA);
    
    Box caraR1 = new Box(0.90f, 0.90f, 0.90f, cR);
    Box caraR2 = new Box(0.90f, 0.90f, 0.90f, cR);
    Box caraR3 = new Box(0.90f, 0.90f, 0.90f, cR);
    Box caraR4 = new Box(0.90f, 0.90f, 0.90f, cR);
    
    Box caraN1 = new Box(0.90f, 0.90f, 0.90f, cN);
    Box caraN2 = new Box(0.90f, 0.90f, 0.90f, cN);
    Box caraN3 = new Box(0.90f, 0.90f, 0.90f, cN);
    Box caraN4 = new Box(0.90f, 0.90f, 0.90f, cN);
    
    Box caraAz1 = new Box(0.90f, 0.90f, 0.90f, cAz);
    Box caraAz2 = new Box(0.90f, 0.90f, 0.90f, cAz);
    Box caraAz3 = new Box(0.90f, 0.90f, 0.90f, cAz);
    Box caraAz4 = new Box(0.90f, 0.90f, 0.90f, cAz);
    
    Box caraV1 = new Box(0.90f, 0.90f, 0.90f, cV);
    Box caraV2 = new Box(0.90f, 0.90f, 0.90f, cV);
    Box caraV3 = new Box(0.90f, 0.90f, 0.90f, cV);
    Box caraV4 = new Box(0.90f, 0.90f, 0.90f, cV);
    
    
    
    Box cubo1 = new Box(1.0f, 1.0f, 1.0f, gold);
    Box cubo2 = new Box(1.0f, 1.0f, 1.0f, gold);
    Box cubo3 = new Box(1.0f, 1.0f, 1.0f, gold);
    Box cubo4 = new Box(1.0f, 1.0f, 1.0f, gold);
    Box cubo5 = new Box(1.0f, 1.0f, 1.0f, gold);
    Box cubo6 = new Box(1.0f, 1.0f, 1.0f, gold);
    Box cubo7 = new Box(1.0f, 1.0f, 1.0f, gold);
    Box cubo8 = new Box(1.0f, 1.0f, 1.0f, gold);
    
    transCube1 = new Transform3D ();
    transCube1.set (new Vector3f(1.05f, 1.05f, 1.05f));
    tgCube1 = new TransformGroup (transCube1);
    
    transCube2 = new Transform3D ();
    transCube2.set (new Vector3f(1.05f, 1.05f, -1.05f));
    tgCube2 = new TransformGroup (transCube2);
    
    transCube3 = new Transform3D ();
    transCube3.set (new Vector3f(1.05f, -1.05f, 1.05f));
    tgCube3 = new TransformGroup (transCube3);
    
    transCube4 = new Transform3D ();
    transCube4.set (new Vector3f(1.05f, -1.05f, -1.05f));
    tgCube4 = new TransformGroup (transCube4);
    
    transCube5 = new Transform3D ();
    transCube5.set (new Vector3f(-1.05f, 1.05f, 1.05f));
    tgCube5 = new TransformGroup (transCube5);
    
    transCube6 = new Transform3D ();
    transCube6.set (new Vector3f(-1.05f, 1.05f, -1.05f));
    tgCube6 = new TransformGroup (transCube6);
    
    transCube7 = new Transform3D ();
    transCube7.set (new Vector3f(-1.05f, -1.05f, 1.05f));
    tgCube7 = new TransformGroup (transCube7);
    
    transCube8 = new Transform3D ();
    transCube8.set (new Vector3f(-1.05f, -1.05f, -1.05f));
    tgCube8 = new TransformGroup (transCube8);
    
    
    tgCube1.setCapability(TransformGroup.ALLOW_TRANSFORM_READ);
    tgCube1.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE); 
    
    tgCube2.setCapability(TransformGroup.ALLOW_TRANSFORM_READ);
    tgCube2.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE); 
    
    tgCube3.setCapability(TransformGroup.ALLOW_TRANSFORM_READ);
    tgCube3.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE); 
    
    tgCube4.setCapability(TransformGroup.ALLOW_TRANSFORM_READ);
    tgCube4.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE); 
    
    tgCube5.setCapability(TransformGroup.ALLOW_TRANSFORM_READ);
    tgCube5.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
    
    tgCube6.setCapability(TransformGroup.ALLOW_TRANSFORM_READ);
    tgCube6.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE); 
    
    tgCube7.setCapability(TransformGroup.ALLOW_TRANSFORM_READ);
    tgCube7.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE); 
    
    tgCube8.setCapability(TransformGroup.ALLOW_TRANSFORM_READ);
    tgCube8.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE); 
    
    
    Transform3D transCaraB1 = new Transform3D ();
    transCaraB1.set (new Vector3f(0.2f, 0.0f, 0.0f));
    TransformGroup tgCaraB1 = new TransformGroup (transCaraB1);
    
    Transform3D transCaraB2 = new Transform3D ();
    transCaraB2.set (new Vector3f(0.2f, 0.0f, 0.0f));
    TransformGroup tgCaraB2 = new TransformGroup (transCaraB2);
    
    Transform3D transCaraB3 = new Transform3D ();
    transCaraB3.set (new Vector3f(0.2f, 0.0f, 0.0f));
    TransformGroup tgCaraB3 = new TransformGroup (transCaraB3);
    
    Transform3D transCaraB4 = new Transform3D ();
    transCaraB4.set (new Vector3f(0.2f, 0.0f, 0.0f));
    TransformGroup tgCaraB4 = new TransformGroup (transCaraB4);
    
    
    
    Transform3D transCaraA1 = new Transform3D ();
    transCaraA1.set (new Vector3f(-0.2f, 0.0f, 0.0f));
    TransformGroup tgCaraA1 = new TransformGroup (transCaraA1);
    
    Transform3D transCaraA2 = new Transform3D ();
    transCaraA2.set (new Vector3f(-0.2f, 0.0f, 0.0f));
    TransformGroup tgCaraA2 = new TransformGroup (transCaraA2);
    
    Transform3D transCaraA3 = new Transform3D ();
    transCaraA3.set (new Vector3f(-0.2f, 0.0f, 0.0f));
    TransformGroup tgCaraA3 = new TransformGroup (transCaraA3);
    
    Transform3D transCaraA4 = new Transform3D ();
    transCaraA4.set (new Vector3f(-0.2f, 0.0f, 0.0f));
    TransformGroup tgCaraA4 = new TransformGroup (transCaraA4);
    
    
    Transform3D transCaraR1 = new Transform3D ();
    transCaraR1.set (new Vector3f(0.0f, 0.2f, 0.0f));
    TransformGroup tgCaraR1 = new TransformGroup (transCaraR1);
    
    Transform3D transCaraR2 = new Transform3D ();
    transCaraR2.set (new Vector3f(0.0f, 0.2f, 0.0f));
    TransformGroup tgCaraR2 = new TransformGroup (transCaraR2);
    
    Transform3D transCaraR3 = new Transform3D ();
    transCaraR3.set (new Vector3f(0.0f, 0.2f, 0.0f));
    TransformGroup tgCaraR3 = new TransformGroup (transCaraR3);
    
    Transform3D transCaraR4 = new Transform3D ();
    transCaraR4.set (new Vector3f(0.0f, 0.2f, 0.0f));
    TransformGroup tgCaraR4 = new TransformGroup (transCaraR4);
    
    
    Transform3D transCaraN1 = new Transform3D ();
    transCaraN1.set (new Vector3f(0.0f, -0.2f, 0.0f));
    TransformGroup tgCaraN1 = new TransformGroup (transCaraN1);
    
    Transform3D transCaraN2 = new Transform3D ();
    transCaraN2.set (new Vector3f(0.0f, -0.2f, 0.0f));
    TransformGroup tgCaraN2 = new TransformGroup (transCaraN2);
    
    Transform3D transCaraN3 = new Transform3D ();
    transCaraN3.set (new Vector3f(0.0f, -0.2f, 0.0f));
    TransformGroup tgCaraN3 = new TransformGroup (transCaraN3);
    
    Transform3D transCaraN4 = new Transform3D ();
    transCaraN4.set (new Vector3f(0.0f, -0.2f, 0.0f));
    TransformGroup tgCaraN4 = new TransformGroup (transCaraN4);
    
    
    Transform3D transCaraAz1 = new Transform3D ();
    transCaraAz1.set (new Vector3f(0.0f, 0.0f, 0.20f));
    TransformGroup tgCaraAz1 = new TransformGroup (transCaraAz1);
    
    Transform3D transCaraAz2 = new Transform3D ();
    transCaraAz2.set (new Vector3f(0.0f, 0.0f, 0.20f));
    TransformGroup tgCaraAz2 = new TransformGroup (transCaraAz2);
    
    Transform3D transCaraAz3 = new Transform3D ();
    transCaraAz3.set (new Vector3f(0.0f, 0.0f, 0.20f));
    TransformGroup tgCaraAz3 = new TransformGroup (transCaraAz3);
    
    Transform3D transCaraAz4 = new Transform3D ();
    transCaraAz4.set (new Vector3f(0.0f, 0.0f, 0.20f));
    TransformGroup tgCaraAz4 = new TransformGroup (transCaraAz4);
    
    
    Transform3D transCaraV1 = new Transform3D ();
    transCaraV1.set (new Vector3f(0.0f, 0.0f, -0.20f));
    TransformGroup tgCaraV1 = new TransformGroup (transCaraV1);
    
    Transform3D transCaraV2 = new Transform3D ();
    transCaraV2.set (new Vector3f(0.0f, 0.0f, -0.20f));
    TransformGroup tgCaraV2 = new TransformGroup (transCaraV2);
    
    Transform3D transCaraV3 = new Transform3D ();
    transCaraV3.set (new Vector3f(0.0f, 0.0f, -0.20f));
    TransformGroup tgCaraV3 = new TransformGroup (transCaraV3);
    
    Transform3D transCaraV4 = new Transform3D ();
    transCaraV4.set (new Vector3f(0.0f, 0.0f, -0.20f));
    TransformGroup tgCaraV4 = new TransformGroup (transCaraV4);
    
    
    
    
    
    tgCube1.addChild(cubo1);
    this.addChild(tgCube1);
    
    tgCube2.addChild(cubo2);
    this.addChild(tgCube2);
    
    tgCube3.addChild(cubo3);
    this.addChild(tgCube3);
    
    tgCube4.addChild(cubo4);
    this.addChild(tgCube4);
    
    tgCube5.addChild(cubo5);
    this.addChild(tgCube5);
    
    tgCube6.addChild(cubo6);
    this.addChild(tgCube6);
    
    tgCube7.addChild(cubo7);
    this.addChild(tgCube7);
    
    tgCube8.addChild(cubo8);
    this.addChild(tgCube8);

    tgCube1.addChild(tgCaraB1);
    tgCaraB1.addChild(caraB1);
    tgCube2.addChild(tgCaraB2);
    tgCaraB2.addChild(caraB2);
    tgCube3.addChild(tgCaraB3);
    tgCaraB3.addChild(caraB3);
    tgCube4.addChild(tgCaraB4);
    tgCaraB4.addChild(caraB4);
    
    tgCube5.addChild(tgCaraA1);
    tgCaraA1.addChild(caraA1);
    tgCube6.addChild(tgCaraA2);
    tgCaraA2.addChild(caraA2);
    tgCube7.addChild(tgCaraA3);
    tgCaraA3.addChild(caraA3);
    tgCube8.addChild(tgCaraA4);
    tgCaraA4.addChild(caraA4);
    
    tgCube1.addChild(tgCaraR1);
    tgCaraR1.addChild(caraR1);
    tgCube2.addChild(tgCaraR2);
    tgCaraR2.addChild(caraR2);
    tgCube5.addChild(tgCaraR3);
    tgCaraR3.addChild(caraR3);
    tgCube6.addChild(tgCaraR4);
    tgCaraR4.addChild(caraR4);
    
    tgCube3.addChild(tgCaraN1);
    tgCaraN1.addChild(caraN1);
    tgCube4.addChild(tgCaraN2);
    tgCaraN2.addChild(caraN2);
    tgCube7.addChild(tgCaraN3);
    tgCaraN3.addChild(caraN3);
    tgCube8.addChild(tgCaraN4);
    tgCaraN4.addChild(caraN4);
    
    tgCube1.addChild(tgCaraAz1);
    tgCaraAz1.addChild(caraAz1);
    tgCube3.addChild(tgCaraAz2);
    tgCaraAz2.addChild(caraAz2);
    tgCube5.addChild(tgCaraAz3);
    tgCaraAz3.addChild(caraAz3);
    tgCube7.addChild(tgCaraAz4);
    tgCaraAz4.addChild(caraAz4);
    
    tgCube2.addChild(tgCaraV1);
    tgCaraV1.addChild(caraV1);
    tgCube4.addChild(tgCaraV2);
    tgCaraV2.addChild(caraV2);
    tgCube6.addChild(tgCaraV3);
    tgCaraV3.addChild(caraV3);
    tgCube8.addChild(tgCaraV4);
    tgCaraV4.addChild(caraV4);
    
  }
  
  public void efectuarMovimiento(int rot, int n) {
      ArrayList<Integer> numCubos = new ArrayList<Integer>();
      numCubos = buscarCubos(rot, n);
      Transform3D T = new Transform3D();
      T = transformacion(rot, n);
      modificarVariablesCubos(rot, n, numCubos);
      modificarOrientacionesCaras(rot, n, numCubos);
      if (numCubos.contains(1)){
          transCube1.mul(T, transCube1);
          tgCube1.setTransform(transCube1);
      }
      if (numCubos.contains(2)){
          transCube2.mul(T, transCube2);
          tgCube2.setTransform(transCube2);
      }
      if (numCubos.contains(3)){
          transCube3.mul(T, transCube3);
          tgCube3.setTransform(transCube3);
      }
      if (numCubos.contains(4)){
          transCube4.mul(T, transCube4);
          tgCube4.setTransform(transCube4);
      }
      if (numCubos.contains(5)){
          transCube5.mul(T, transCube5);
          tgCube5.setTransform(transCube5);
      }
      if (numCubos.contains(6)){
          transCube6.mul(T, transCube6);
          tgCube6.setTransform(transCube6);
      }
      if (numCubos.contains(7)){
          transCube7.mul(T, transCube7);
          tgCube7.setTransform(transCube7);
      }
      if (numCubos.contains(8)){
          transCube8.mul(T, transCube8);
          tgCube8.setTransform(transCube8);
      }
  }
  
  private void modificarVariablesCubos(int rot, int n, ArrayList<Integer> numCubos){
      if (numCubos.contains(1)){
          modificarVarCubo(rot, n, varcubo1);
      }
      if (numCubos.contains(2)){
          modificarVarCubo(rot, n, varcubo2);
      }
      if (numCubos.contains(3)){
          modificarVarCubo(rot, n, varcubo3);
      }
      if (numCubos.contains(4)){
          modificarVarCubo(rot, n, varcubo4);
      }
      if (numCubos.contains(5)){
          modificarVarCubo(rot, n, varcubo5);
      }
      if (numCubos.contains(6)){
          modificarVarCubo(rot, n, varcubo6);
      }
      if (numCubos.contains(7)){
          modificarVarCubo(rot, n, varcubo7);
      }
      if (numCubos.contains(8)){
          modificarVarCubo(rot, n, varcubo8);
      }
  }
  
  private void modificarVarCubo(int rot, int n, ArrayList<Integer> varcubo){
      if (rot==1 && Math.abs(n)==3){
          if (varcubo.get(0)==1 && varcubo.get(1)==1)   varcubo.set(0, -1);
          else if (varcubo.get(0)==1 && varcubo.get(1)==-1)  varcubo.set(1, 1);
          else if (varcubo.get(0)==-1 && varcubo.get(1)==1)  varcubo.set(1, -1);
          else if (varcubo.get(0)==-1 && varcubo.get(1)==-1) varcubo.set(0, 1);
      }
      else if (rot==1 && Math.abs(n)==2){
          if (varcubo.get(2)==1 && varcubo.get(0)==1)   varcubo.set(2, -1);
          else if (varcubo.get(2)==1 && varcubo.get(0)==-1)  varcubo.set(0, 1);
          else if (varcubo.get(2)==-1 && varcubo.get(0)==1)  varcubo.set(0, -1);
          else if (varcubo.get(2)==-1 && varcubo.get(0)==-1) varcubo.set(2, 1);
      }
      else if (rot==-1 && Math.abs(n)==1){
          if (varcubo.get(2)==1 && varcubo.get(1)==1)   varcubo.set(2, -1);
          else if (varcubo.get(2)==1 && varcubo.get(1)==-1)  varcubo.set(1, 1);
          else if (varcubo.get(2)==-1 && varcubo.get(1)==1)  varcubo.set(1, -1);
          else if (varcubo.get(2)==-1 && varcubo.get(1)==-1) varcubo.set(2, 1);
      }
      else if (rot==-1 && Math.abs(n)==3){
          if (varcubo.get(0)==1 && varcubo.get(1)==1)   varcubo.set(1, -1);
          else if (varcubo.get(0)==1 && varcubo.get(1)==-1)  varcubo.set(0, -1);
          else if (varcubo.get(0)==-1 && varcubo.get(1)==1)  varcubo.set(0, 1);
          else if (varcubo.get(0)==-1 && varcubo.get(1)==-1) varcubo.set(1, 1);
      }
      else if (rot==-1 && Math.abs(n)==2){
          if (varcubo.get(2)==1 && varcubo.get(0)==1)   varcubo.set(0, -1);
          else if (varcubo.get(2)==1 && varcubo.get(0)==-1)  varcubo.set(2, -1);
          else if (varcubo.get(2)==-1 && varcubo.get(0)==1)  varcubo.set(2, 1);
          else if (varcubo.get(2)==-1 && varcubo.get(0)==-1) varcubo.set(0, 1);
      }
      else if (rot==1 && Math.abs(n)==1){
          if (varcubo.get(2)==1 && varcubo.get(1)==1)   varcubo.set(1, -1);
          else if (varcubo.get(2)==1 && varcubo.get(1)==-1)  varcubo.set(2, -1);
          else if (varcubo.get(2)==-1 && varcubo.get(1)==1)  varcubo.set(2, 1);
          else if (varcubo.get(2)==-1 && varcubo.get(1)==-1) varcubo.set(1, 1);
      }
  }
  
  private Transform3D transformacion (int rot, int n) {
      Transform3D rotacion = new Transform3D();
      if (Math.abs(n)==1){
          rotacion.rotX(rot*Math.PI/2);
      }
      else if (Math.abs(n)==2){
          rotacion.rotY(rot*Math.PI/2);
      }
      else if (Math.abs(n)==3){
          rotacion.rotZ(rot*Math.PI/2);
      }
      return rotacion;
  }
  
  private ArrayList<Integer> buscarCubos(int rot, int n) {
      ArrayList<Integer> varcubos = new ArrayList<Integer>();
      if (n==3) {
          if (varcubo1.get(2) == 1) varcubos.add(1);
          if (varcubo2.get(2) == 1) varcubos.add(2);
          if (varcubo3.get(2) == 1) varcubos.add(3);
          if (varcubo4.get(2) == 1) varcubos.add(4);
          if (varcubo5.get(2) == 1) varcubos.add(5);
          if (varcubo6.get(2) == 1) varcubos.add(6);
          if (varcubo7.get(2) == 1) varcubos.add(7);
          if (varcubo8.get(2) == 1) varcubos.add(8);
      }
      else if (n==-3) {
          if (varcubo1.get(2) == -1) varcubos.add(1);
          if (varcubo2.get(2) == -1) varcubos.add(2);
          if (varcubo3.get(2) == -1) varcubos.add(3);
          if (varcubo4.get(2) == -1) varcubos.add(4);
          if (varcubo5.get(2) == -1) varcubos.add(5);
          if (varcubo6.get(2) == -1) varcubos.add(6);
          if (varcubo7.get(2) == -1) varcubos.add(7);
          if (varcubo8.get(2) == -1) varcubos.add(8);
      }
      else if (n==2) {
          if (varcubo1.get(1) == 1) varcubos.add(1);
          if (varcubo2.get(1) == 1) varcubos.add(2);
          if (varcubo3.get(1) == 1) varcubos.add(3);
          if (varcubo4.get(1) == 1) varcubos.add(4);
          if (varcubo5.get(1) == 1) varcubos.add(5);
          if (varcubo6.get(1) == 1) varcubos.add(6);
          if (varcubo7.get(1) == 1) varcubos.add(7);
          if (varcubo8.get(1) == 1) varcubos.add(8);
      }
      else if (n==-2) {
          if (varcubo1.get(1) == -1) varcubos.add(1);
          if (varcubo2.get(1) == -1) varcubos.add(2);
          if (varcubo3.get(1) == -1) varcubos.add(3);
          if (varcubo4.get(1) == -1) varcubos.add(4);
          if (varcubo5.get(1) == -1) varcubos.add(5);
          if (varcubo6.get(1) == -1) varcubos.add(6);
          if (varcubo7.get(1) == -1) varcubos.add(7);
          if (varcubo8.get(1) == -1) varcubos.add(8);
      }
      else if (n==1) {
          if (varcubo1.get(0) == 1) varcubos.add(1);
          if (varcubo2.get(0) == 1) varcubos.add(2);
          if (varcubo3.get(0) == 1) varcubos.add(3);
          if (varcubo4.get(0) == 1) varcubos.add(4);
          if (varcubo5.get(0) == 1) varcubos.add(5);
          if (varcubo6.get(0) == 1) varcubos.add(6);
          if (varcubo7.get(0) == 1) varcubos.add(7);
          if (varcubo8.get(0) == 1) varcubos.add(8);
      }
      else if (n==-1) {
          if (varcubo1.get(0) == -1) varcubos.add(1);
          if (varcubo2.get(0) == -1) varcubos.add(2);
          if (varcubo3.get(0) == -1) varcubos.add(3);
          if (varcubo4.get(0) == -1) varcubos.add(4);
          if (varcubo5.get(0) == -1) varcubos.add(5);
          if (varcubo6.get(0) == -1) varcubos.add(6);
          if (varcubo7.get(0) == -1) varcubos.add(7);
          if (varcubo8.get(0) == -1) varcubos.add(8);
      }
      
      return varcubos;
  }
  
    private void modificarOrientacionesCaras(int rot, int n, ArrayList<Integer> cubos){
        ArrayList<Integer> caras = buscarCaras(cubos);
        //Hacer un if else que recorra todas las caras de todos los colores y los modifiquen según su orientación y la rotación
        if (caras.contains(1)) modificarOrientacionCara(rot, n, bl1);
        if (caras.contains(2)) modificarOrientacionCara(rot, n, bl2);
        if (caras.contains(3)) modificarOrientacionCara(rot, n, bl3);
        if (caras.contains(4)) modificarOrientacionCara(rot, n, bl4);
        if (caras.contains(5)) modificarOrientacionCara(rot, n, az1);
        if (caras.contains(6)) modificarOrientacionCara(rot, n, az2);
        if (caras.contains(7)) modificarOrientacionCara(rot, n, az3);
        if (caras.contains(8)) modificarOrientacionCara(rot, n, az4);
        if (caras.contains(9)) modificarOrientacionCara(rot, n, ro1);
        if (caras.contains(10)) modificarOrientacionCara(rot, n, ro2);
        if (caras.contains(11)) modificarOrientacionCara(rot, n, ro3);
        if (caras.contains(12)) modificarOrientacionCara(rot, n, ro4);
        if (caras.contains(13)) modificarOrientacionCara(rot, n, ve1);
        if (caras.contains(14)) modificarOrientacionCara(rot, n, ve2);
        if (caras.contains(15)) modificarOrientacionCara(rot, n, ve3);
        if (caras.contains(16)) modificarOrientacionCara(rot, n, ve4);
        if (caras.contains(17)) modificarOrientacionCara(rot, n, am1);
        if (caras.contains(18)) modificarOrientacionCara(rot, n, am2);
        if (caras.contains(19)) modificarOrientacionCara(rot, n, am3);
        if (caras.contains(20)) modificarOrientacionCara(rot, n, am4);
        if (caras.contains(21)) modificarOrientacionCara(rot, n, na1);
        if (caras.contains(22)) modificarOrientacionCara(rot, n, na2);
        if (caras.contains(23)) modificarOrientacionCara(rot, n, na3);
        if (caras.contains(24)) modificarOrientacionCara(rot, n, na4);
    }
    
    private void modificarOrientacionCara(int rot, int n, ArrayList<Integer> cara){
        if (rot==1 && Math.abs(n)==3){
          if (cara.get(0)==1) {cara.set(0, 0); cara.set(1, 1);}
          else if (cara.get(1)==1)  {cara.set(1, 0); cara.set(0, -1);}
          else if (cara.get(0)==-1) {cara.set(0, 0); cara.set(1, -1);}
          else if (cara.get(1)==-1) {cara.set(0, 1); cara.set(1, 0);}
      }
      else if (rot==1 && Math.abs(n)==2){
          if (cara.get(0)==1)   {cara.set(0, 0); cara.set(2, -1);}
          else if (cara.get(2)==1)  {cara.set(2, 0); cara.set(0, 1);}
          else if (cara.get(0)==-1) {cara.set(0, 0); cara.set(2, 1);}
          else if (cara.get(2)==-1) {cara.set(2, 0); cara.set(0, -1);}
      }
      else if (rot==-1 && Math.abs(n)==1){
          if (cara.get(1)==1)  {cara.set(1, 0); cara.set(2, -1);}
          else if (cara.get(2)==1)  {cara.set(2, 0); cara.set(1, 1);}
          else if (cara.get(1)==-1) {cara.set(1, 0); cara.set(2, 1);}
          else if (cara.get(2)==-1) {cara.set(2, 0); cara.set(1, -1);}
      }
      else if (rot==-1 && Math.abs(n)==3){
          if (cara.get(0)==1)   {cara.set(0, 0); cara.set(1, -1);}
          else if (cara.get(1)==1)  {cara.set(1, 0); cara.set(0, 1);}
          else if (cara.get(0)==-1) {cara.set(0, 0); cara.set(1, 1);}
          else if (cara.get(1)==-1) {cara.set(1, 0); cara.set(0, -1);}
      }
      else if (rot==-1 && Math.abs(n)==2){
          if (cara.get(0)==1)   {cara.set(0, 0); cara.set(2, 1);}
          else if (cara.get(2)==1)  {cara.set(2, 0); cara.set(0, -1);}
          else if (cara.get(0)==-1) {cara.set(0, 0); cara.set(2, -1);}
          else if (cara.get(2)==-1) {cara.set(2, 0); cara.set(0, 1);}
      }
      else if (rot==1 && Math.abs(n)==1){
          if (cara.get(1)==1)  {cara.set(1, 0); cara.set(2, 1);}
          else if (cara.get(2)==1)  {cara.set(2, 0); cara.set(1, -1);}
          else if (cara.get(1)==-1) {cara.set(1, 0); cara.set(2, -1);}
          else if (cara.get(2)==-1) {cara.set(2, 0); cara.set(1, 1);}
      }
    }
    
    public boolean terminado(){
        boolean terminado = false;
        if (bl1.equals(bl2) && bl2.equals(bl2) && bl3.equals(bl4)){
            if (az1.equals(az2) && az2.equals(az3) && az3.equals(az4)){
                if (ro1.equals(ro2) && ro2.equals(ro3) && ro3.equals(ro4)){
                    if (ve1.equals(ve2) && ve2.equals(ve3) && ve3.equals(ve4)){
                        if (am1.equals(am2) && am2.equals(am3) && am3.equals(am4)){
                            if (na1.equals(na1) && na2.equals(na3) && na3.equals(na4)){
                                terminado = true;
                            }
                        }
                    }
                }
            }
        }
        
        return terminado;
    }
    
    public void desmontar(){
        for (int i = 0; i < 30; i++){
            int rot = (int) (Math.random() * 2);
            int n = (int) (Math.random() * 3) + 1;
            int ori = (int) (Math.random() *2);

            if (rot == 0) rot = -1;
            if (ori == 0) n = (-1)* n;
            efectuarMovimiento(rot, n);
        }
    }
    
    private ArrayList<Integer> buscarCaras(ArrayList<Integer> cubos){
        ArrayList<Integer> caras = new ArrayList<Integer>();
        if (cubos.contains(1)){
            caras.add(1);
            caras.add(5);
            caras.add(9);
        }
        if (cubos.contains(2)){
            caras.add(2);
            caras.add(10);
            caras.add(13);
        }
        if (cubos.contains(3)){
            caras.add(3);
            caras.add(6);
            caras.add(21);
        }
        if (cubos.contains(4)){
            caras.add(4);
            caras.add(14);
            caras.add(22);
        }
        if (cubos.contains(5)){
            caras.add(7);
            caras.add(11);
            caras.add(17);
        }
        if (cubos.contains(6)){
            caras.add(12);
            caras.add(15);
            caras.add(18);
        }
        if (cubos.contains(7)){
            caras.add(8);
            caras.add(19);
            caras.add(23);
        }
        if (cubos.contains(8)){
            caras.add(16);
            caras.add(20);
            caras.add(24);
        }
        
        return caras;
    }
  
    private void inicializarVarCubos() {
        varcubo1.add(1);
        varcubo1.add(1);
        varcubo1.add(1);
        varcubo2.add(1);
        varcubo2.add(1);
        varcubo2.add(-1);
        varcubo3.add(1);
        varcubo3.add(-1);
        varcubo3.add(1);
        varcubo4.add(1);
        varcubo4.add(-1);
        varcubo4.add(-1);
        varcubo5.add(-1);
        varcubo5.add(1);
        varcubo5.add(1);
        varcubo6.add(-1);
        varcubo6.add(1);
        varcubo6.add(-1);
        varcubo7.add(-1);
        varcubo7.add(-1);
        varcubo7.add(1);
        varcubo8.add(-1);
        varcubo8.add(-1);
        varcubo8.add(-1);
        
        //Caras blancas, orientación inicial
        bl1.add(1);
        bl1.add(0);
        bl1.add(0);
        bl2.add(1);
        bl2.add(0);
        bl2.add(0);
        bl3.add(1);
        bl3.add(0);
        bl3.add(0);
        bl4.add(1);
        bl4.add(0);
        bl4.add(0);
        //Caras rojas, orientación inicial
        ro1.add(0);
        ro1.add(1);
        ro1.add(0);
        ro2.add(0);
        ro2.add(1);
        ro2.add(0);
        ro3.add(0);
        ro3.add(1);
        ro3.add(0);
        ro4.add(0);
        ro4.add(1);
        ro4.add(0);
        //Caras azules, orientación inicial
        az1.add(0);
        az1.add(0);
        az1.add(1);
        az2.add(0);
        az2.add(0);
        az2.add(1);
        az3.add(0);
        az3.add(0);
        az3.add(1);
        az4.add(0);
        az4.add(0);
        az4.add(1);
        //Caras amarillas, orientación inicial
        am1.add(-1);
        am1.add(0);
        am1.add(0);
        am2.add(-1);
        am2.add(0);
        am2.add(0);
        am3.add(-1);
        am3.add(0);
        am3.add(0);
        am4.add(-1);
        am4.add(0);
        am4.add(0);
        //Caras rojas, orientación inicial
        na1.add(0);
        na1.add(-1);
        na1.add(0);
        na2.add(0);
        na2.add(-1);
        na2.add(0);
        na3.add(0);
        na3.add(-1);
        na3.add(0);
        na4.add(0);
        na4.add(-1);
        na4.add(0);
        //Caras azules, orientación inicial
        ve1.add(0);
        ve1.add(0);
        ve1.add(-1);
        ve2.add(0);
        ve2.add(0);
        ve2.add(-1);
        ve3.add(0);
        ve3.add(0);
        ve3.add(-1);
        ve4.add(0);
        ve4.add(0);
        ve4.add(-1);
    }
}
